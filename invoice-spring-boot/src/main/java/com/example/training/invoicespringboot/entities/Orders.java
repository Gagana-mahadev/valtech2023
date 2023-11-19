package com.example.training.invoicespringboot.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	private String orderDate;
	private int customerid;
	private int orderDescId;
	
	
	public Orders() {
	}
	
	
	public Orders(int orderid, String orderDate, int customerid, int orderDescId) {
		this.orderid = orderid;
		this.orderDate = orderDate;
		this.customerid = customerid;
		this.orderDescId = orderDescId;
	}
	
	


	public Orders(String orderDate, int customerid, int orderDescId) {
		this.orderDate = orderDate;
		this.customerid = customerid;
		this.orderDescId = orderDescId;
	}


	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getOrderDescId() {
		return orderDescId;
	}
	public void setOrderDescId(int orderDescId) {
		this.orderDescId = orderDescId;
	}
	
	
	
	

}
