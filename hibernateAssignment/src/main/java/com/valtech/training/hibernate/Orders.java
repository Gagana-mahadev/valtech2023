package com.valtech.training.hibernate;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Orders {

	private int id;
	private Date orderDate;
	@ManyToOne(targetEntity = Customers.class,cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.EAGER)
	@JoinColumn(name = "cust_id",referencedColumnName = "id")
	private Customers customer;

	public Orders() {
	}

	public Orders(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getId() {
		return id;
	}

	public void setOrderId(int id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
