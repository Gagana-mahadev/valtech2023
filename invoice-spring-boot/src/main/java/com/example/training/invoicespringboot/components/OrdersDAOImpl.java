package com.example.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.training.invoicespringboot.entities.Orders;

@Component
public class OrdersDAOImpl implements OrdersDAO{
	
	class OrderRowMapper implements RowMapper<Orders>{

		@Override
		public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
			Orders order = new Orders();
			order.setCustomerid(rs.getInt(1));
			order.setOrderDate(rs.getString(2));
			order.setCustomerid(rs.getInt(3));
			order.setOrderDescId(rs.getInt(4));
			return order;
		}
		
	}
	
	@Autowired
	DataSource datasource;

	@Override
	public void deleteOrder(int orderid) {
		String deletQry = "DELETE FROM ORDERS WHERE ORDERID=?";
		new JdbcTemplate(datasource).update(deletQry,orderid);
		
	}

	@Override
	public void createOrder(Orders order) {
		String createQry = "INSERT INTO ORDERS(ORDER_DATE,CUSTOMERID,ORDER_DESC_ID) VALUES(?,?,?)";
		new JdbcTemplate(datasource).update(createQry,order.getOrderDate(),order.getCustomerid(),order.getOrderDescId());
		
	}

	@Override
	public void updateOrder(Orders order) {
		String updateQry ="UPDATE ORDERS SET ORDER_DATE,CUSTOMERID,ORDER_DESC_ID WHERE ORDERID=?";
		new JdbcTemplate(datasource).update(updateQry,order.getOrderDate(),order.getCustomerid(),order.getOrderDescId(),order.getOrderid());
		
	}

	@Override
	public long count() {
		String countQry = "SELECT COUNT(ORDERID) FROM ORDERS";
		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
	}

	@Override
	public List<Orders> getAllOrders() {
		String selectAllQry ="SELECT ORDERID,ORDER_DATE,CUSTOMERID,ORDER_DESC_ID FROM ORDERS";
		return new JdbcTemplate(datasource).query(selectAllQry,new OrderRowMapper() );
	}

	@Override
	public Orders getOrders(int orderid) {
		String selectQry ="SELECT ORDER_DATE,CUSTOMERID,ORDER_DESC_ID FROM ORDERS WHERE ORDERID= "+orderid;
		return new JdbcTemplate(datasource).queryForObject(selectQry, new OrderRowMapper());
	}

}
