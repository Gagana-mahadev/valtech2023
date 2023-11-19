package com.example.training.invoicespringboot.components;

import java.util.List;

import com.example.training.invoicespringboot.entities.Items;

public interface ItemsDAO {

	void createItem(Items items);

	void updateItem(Items items);

	void deleteItem(int itemid);

	public long count();

	List<Items> getAllItems();

	Items getItems(int itemid);

}
