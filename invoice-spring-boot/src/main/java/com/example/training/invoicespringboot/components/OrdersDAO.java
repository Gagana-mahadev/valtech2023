package com.example.training.invoicespringboot.components;

import java.util.List;

import com.example.training.invoicespringboot.entities.Orders;

public interface OrdersDAO {
	
	void deleteOrder(int orderid);
	void createOrder(Orders order);
	void updateOrder(Orders order);
	public long count();
	List<Orders> getAllOrders();
	Orders getOrders(int orderid);
	

}
