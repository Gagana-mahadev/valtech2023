package com.example.training.invoicespringboot.components;

import java.util.List;

import com.example.training.invoicespringboot.entities.OrderDescription;
import com.example.training.invoicespringboot.entities.Orders;

public interface OrderDescriptionDAO {

	void createOrderDescription(OrderDescription orderdesc);

	void updateOrderDescription(OrderDescription orderdec);

	void deleteOrderDescription(int orderdescid);

	public long count();

	List<OrderDescription> getAllOrderDescription();

	OrderDescription getOrderDescription(int orderdescid);

}
