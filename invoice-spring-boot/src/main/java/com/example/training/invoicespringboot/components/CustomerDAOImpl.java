package com.example.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.training.invoicespringboot.entities.Customer;

@Component
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private DataSource datasource;
	
	public class CustomerRowMapper implements RowMapper<Customer>{

		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			//SELECT CUSTOMER_ID,CUSTOMER_FIRST_NAME,CUSTOMER_LAST_NAME,PHONE,EMAIL,ADDRESSID FROM CUSTOMER
			Customer cus = new Customer();
			cus.setCustomerId(rs.getInt(1));
			cus.setCustomerFirstName(rs.getString(2));
			cus.setCustomerLastName(rs.getString(3));
			cus.setPhone(rs.getInt(4));
			cus.setEmail(rs.getString(5));
			cus.setAddressid(rs.getInt(6));
			return cus;
		}
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		String deleteQry = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID= ?";
		new JdbcTemplate(datasource).update(deleteQry,customerId);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		String updateQry = "UPDATE CUSTOMER SET CUSTOMER_FIRST_NAME = ?,CUSTOMER_LAST_NAME = ?,PHONE=?,EMAIL=? ADDRESSID=? WHERE CUSTOMER_ID = ?";
		new JdbcTemplate(datasource).update(updateQry,customer.getCustomerFirstName(),customer.getCustomerLastName(),customer.getPhone(),customer.getEmail(),customer.getAddressid(),customer.getCustomerId());
		
	}

	@Override
	public void createCustomer(Customer customer) {
		String createQry ="INSERT INTO CUSTOMER(CUSTOMER_FIRST_NAME,CUSTOMER_LAST_NAME,PHONE,EMAIL,ADDRESSID) VALUES(?,?,?,?,?)";
		new JdbcTemplate(datasource).update(createQry,customer.getCustomerFirstName(),customer.getCustomerLastName(),customer.getPhone(),customer.getEmail(),customer.getAddressid());
	}

	@Override
	public long count() {
		String countQry ="SELECT COUNT(CUSTOMER_ID) FROM CUSTOMER";
		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
	}

	@Override
	public List<Customer> getAllCustomer() {
		String selectAllQry ="SELECT CUSTOMER_ID,CUSTOMER_FIRST_NAME,CUSTOMER_LAST_NAME,PHONE,EMAIL,ADDRESSID FROM CUSTOMER";
		return new JdbcTemplate(datasource).query(selectAllQry, new CustomerRowMapper());
	}

	@Override
	public Customer getCustomer(int customerId) {
		String selectQry ="SELECT CUSTOMER_ID,CUSTOMER_FIRST_NAME,CUSTOMER_LAST_NAME,PHONE,EMAIL,ADDRESSID FROM CUSTOMER WHERE CUSTOMER_ID = "+customerId;
		return new JdbcTemplate(datasource).queryForObject(selectQry,new CustomerRowMapper());
	}
	
	
}
