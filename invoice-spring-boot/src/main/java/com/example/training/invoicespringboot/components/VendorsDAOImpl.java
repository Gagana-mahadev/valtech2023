package com.example.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.training.invoicespringboot.entities.Vendors;

@Component
public class VendorsDAOImpl implements VendorsDAO{
	
	class VendorRowMapper implements RowMapper<Vendors>{

		@Override
		public Vendors mapRow(ResultSet rs, int rowNum) throws SQLException {
			Vendors ven = new Vendors();
			ven.setVendorId(rs.getInt(1));
			ven.setVendorName(rs.getString(2));
			ven.setVendorPhone(rs.getInt(3));
			ven.setVendorEmail(rs.getString(4));
			ven.setVendorAddress(rs.getInt(5));
			return null;
		}
		
	}
	
	@Autowired
	DataSource datasource;

	@Override
	public void createVendor(Vendors vendor) {
		String createQry ="INSERT INTO VENDORS(VENDOR_NAME,VENDOR_PHONE,VENDOR_EMAIL,VENDOR_ADDRESS) VALUES(?,?,?,?)";
		new JdbcTemplate(datasource).update(createQry,vendor.getVendorName(),vendor.getVendorPhone(),vendor.getVendorEmail(),vendor.getVendorAddress());
		
	}

	@Override
	public void updateVendor(Vendors vendor) {
		String updateQry ="UPDATE VENDORS SET VENDOR_NAME,VENDOR_PHONE,VENDOR_EMAIL,VENDOR_ADDRESS WHERE VENDOR_ID=?";
		new JdbcTemplate(datasource).update(updateQry,vendor.getVendorName(),vendor.getVendorPhone(),vendor.getVendorEmail(),vendor.getVendorAddress(),vendor.getVendorId());
		
	}

	@Override
	public void deleteVendor(int vendorid) {
		String deleteQry="DELETE FROM VENDORS WHERE VENDOR_ID=?";
		new JdbcTemplate(datasource).update(deleteQry,vendorid);
		
	}

	@Override
	public long count() {
		String countQry ="SELECT COUNT(VENDOR_ID) FROM VENDORS";
		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
	}

	@Override
	public List<Vendors> getAllVendors() {
		String selectAllQry ="SELECT VENDOR_ID,VENDOR_NAME,VENDOR_PHONE,VENDOR_EMAIL,VENDOR_ADDRESS FROM VENDORS";
		return new JdbcTemplate(datasource).query(selectAllQry, new VendorRowMapper());
	}

	@Override
	public Vendors getVendor(int vendorid) {
		String selectQry ="SELECT VENDOR_ID,VENDOR_NAME,VENDOR_PHONE,VENDOR_EMAIL,VENDOR_ADDRESS FROM VENDORS WHERE VENDOR_ID= "+vendorid;
		return new JdbcTemplate(datasource).queryForObject(selectQry, new VendorRowMapper());
	}

}
