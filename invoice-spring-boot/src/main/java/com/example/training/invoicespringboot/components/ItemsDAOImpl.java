package com.example.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.training.invoicespringboot.entities.Items;

@Component
public class ItemsDAOImpl implements ItemsDAO {

	class ItemsRowMapper implements RowMapper<Items> {

		@Override
		public Items mapRow(ResultSet rs, int rowNum) throws SQLException {
			Items i = new Items();
			i.setItemId(rs.getInt(1));
			i.setItemName(rs.getString(2));
			i.setDescription(rs.getString(3));
			i.setUnitPrice(rs.getInt(4));
			i.setVendorId(rs.getInt(5));
			return i;
		}

	}

	@Autowired
	DataSource datasource;

	@Override
	public void createItem(Items items) {
		String createQry = "INSERT INTO ITEMS(ITEM_NAME,DESCRIPTION,UNIT_PRICE,VENDOR_ID) VALUES(?,?,?,?)";
		new JdbcTemplate(datasource).update(createQry, items.getItemName(), items.getDescription(),
				items.getUnitPrice(), items.getVendorId());

	}

	@Override
	public void updateItem(Items items) {
		String updateQry = "UPDATE ITEMS SET ITEM_NAME,DESCRIPTION,UNIT_PRICE,VENDOR_ID WHERE ITEM_ID=? ";
		new JdbcTemplate(datasource).update(updateQry, items.getItemName(), items.getDescription(),
				items.getUnitPrice(), items.getVendorId());

	}

	@Override
	public void deleteItem(int itemid) {
		String deleteQry = "DELETE FROM ITEMS WHERE ITEM_ID=?";
		new JdbcTemplate(datasource).update(deleteQry, itemid);

	}

	@Override
	public long count() {
		String countQry = "SELECT COUNT(ITEM_ID) FROM ITEMS";
		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
	}

	@Override
	public List<Items> getAllItems() {
		String selectAllQry = "SELECT ITEM_ID,ITEM_NAME,DESCRIPTION,UNIT_PRICE,VENDOR_ID FROM ITEMS";
		return new JdbcTemplate(datasource).query(selectAllQry, new ItemsRowMapper());
	}

	@Override
	public Items getItems(int itemid) {
		String selectQry = "SELECT ITEM_ID,ITEM_NAME,DESCRIPTION,UNIT_PRICE,VENDOR_ID FROM ITEMS WHERE ITEM_ID= "+itemid;
		return new JdbcTemplate(datasource).queryForObject(selectQry, new ItemsRowMapper());
	}

}
