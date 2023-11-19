package com.example.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.training.invoicespringboot.entities.OrderDescription;

@Component
public class OrderDescriptionDAOImpl implements OrderDescriptionDAO{
	
	class OrderDescRowMapper implements RowMapper<OrderDescription>{

		@Override
		public OrderDescription mapRow(ResultSet rs, int rowNum) throws SQLException {
			OrderDescription orderdesc= new OrderDescription();
			orderdesc.setOrderDescid(rs.getInt(1));
			orderdesc.setItemid(rs.getInt(2));
			orderdesc.setQuantity(rs.getInt(3));
			return orderdesc;
		}
		
	}
	
	@Autowired
	DataSource datasource;

	@Override
	public void createOrderDescription(OrderDescription orderdesc) {
		String createQry ="INSERT INTO ORDER_DESCRIPTION(ORDER_DESCID,ITEMID,QUANTITY) VALUES(?,?,?)";
		new JdbcTemplate(datasource).update(createQry,orderdesc.getOrderDescid(),orderdesc.getItemid(),orderdesc.getQuantity());
		
	}

	@Override
	public void updateOrderDescription(OrderDescription orderdec) {
		String updateQry="UPDATE ORDER_DESCRIPTION SET ITEMID,QUANTITY WHERE ORDER_DESCID=?";
		new JdbcTemplate(datasource).update(updateQry,orderdec.getItemid(),orderdec.getQuantity(),orderdec.getOrderDescid());
		
	}

	@Override
	public void deleteOrderDescription(int orderdescid) {
		String deleteQry="DELETE FROM ORDER_DESCRIPTION WHERE ORDER_DESCID=?";
		new JdbcTemplate(datasource).update(deleteQry,orderdescid);
		
	}

	@Override
	public long count() {
		String countQry ="SELECT COUNT(ORDER_DESCID) FROM ORDER_DESCRIPTION";
		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
	}

	@Override
	public List<OrderDescription> getAllOrderDescription() {
		String selectAllQry="SELECT ORDER_DESCID,ITEMID,QUANTITY FROM ORDER_DESCRIPTION";
		return new JdbcTemplate(datasource).query(selectAllQry, new OrderDescRowMapper());
	}

	@Override
	public OrderDescription getOrderDescription(int orderdescid) {
		String selectQry ="SELECT ITEMID,QUANTITY FROM ORDER_DESCRIPTION WHERE ORDER_DESCID= "+orderdescid;
		return new JdbcTemplate(datasource).queryForObject(selectQry, new OrderDescRowMapper());
	}

}
