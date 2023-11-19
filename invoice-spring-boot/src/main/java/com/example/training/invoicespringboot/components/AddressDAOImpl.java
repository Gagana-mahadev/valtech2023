package com.example.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.training.invoicespringboot.entities.Address;

@Component
public class AddressDAOImpl implements AddressDAO {

	@Autowired
	DataSource datasource;

	class AddressRowMapper implements RowMapper<Address> {

		@Override
		public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
			Address add = new Address();
			add.setAddressid(rs.getInt(1));
			add.setBuilding_no(rs.getInt(2));
			add.setStreet(rs.getString(3));
			add.setCity(rs.getString(4));
			add.setState(rs.getString(5));
			add.setCountry(rs.getString(6));
			add.setZipCode(rs.getInt(7));
			return add;
		}

	}

	@Override
	public void createAddress(Address address) {
		String createQry = "INSERT INTO ADDRESS(BUILDING_NO,STREET,CITY,STATE,COUNTRY,ZIP_CODE) VALUES(?,?,?,?,?,?)";
		new JdbcTemplate(datasource).update(createQry, address.getBuilding_no(), address.getStreet(), address.getCity(),
				address.getState(), address.getCountry(), address.getZipCode());

	}

	@Override
	public void deleteAddress(int addressid) {
		String deleteQry = "DELETE FROM ADDRESS WHERE ADDRESSID= ?";
		new JdbcTemplate(datasource).update(deleteQry, addressid);
	}

	@Override
	public void updateAddress(Address address) {
		String updateQry = "UPDATE ADDRESS SET BUILDING_NO,STREET,CITY,STATE,COUNTRY,ZIP_CODE WHERE ADDRESSID = ?";
		new JdbcTemplate(datasource).update(updateQry, address.getBuilding_no(), address.getStreet(), address.getCity(),
				address.getState(), address.getCountry(), address.getZipCode(), address.getAddressid());

	}

	@Override
	public long count() {
		String countQry = "SELECT COUNT(ADDRESSID) FROM ADDRESS";
		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
	}

	@Override
	public List<Address> getAllAddress() {
		String selectAllQry = "SELECT ADDRESSID,BUILDING_NO,STREET,CITY,STATE,COUNTRY,ZIP_CODE FROM ADDRESS";
		return new JdbcTemplate(datasource).query(selectAllQry, new AddressRowMapper());
	}

	@Override
	public Address getAddress(int addressid) {
		String selectQry = "SELECT ADDRESSID,BUILDING_NO,STREET,CITY,STATE,COUNTRY,ZIP_CODE FROM ADDRESS WHERE ADDRESSID=  "
				+addressid;
		return new JdbcTemplate(datasource).queryForObject(selectQry, new AddressRowMapper());
	}

}
