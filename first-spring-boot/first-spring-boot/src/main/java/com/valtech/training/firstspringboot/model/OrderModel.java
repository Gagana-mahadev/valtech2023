package com.valtech.training.firstspringboot.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.valtech.training.firstspringboot.entities.Order;

public class OrderModel {

	private static final DateTimeFormatter ORDER_DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private long id;
	private String item;
	private String description;
	private int itemcount;
	private String orderDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getItemcount() {
		return itemcount;
	}

	public void setItemcount(int itemcount) {
		this.itemcount = itemcount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public OrderModel() {

	}

	public OrderModel(Order o) {
		this.id = o.getId();
		this.item = o.getItem();
		this.itemcount = o.getItemcount();
		this.description = o.getDescription();
		this.orderDate = o.getOrderDate() == null ? "" : o.getOrderDate().format(ORDER_DATE_FORMAT);
	}

	public Order getOrder() {
		return new Order(id, item, itemcount, description, LocalDate.parse(orderDate, ORDER_DATE_FORMAT));

	}

}
