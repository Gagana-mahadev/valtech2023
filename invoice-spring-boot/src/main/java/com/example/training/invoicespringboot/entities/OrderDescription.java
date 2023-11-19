package com.example.training.invoicespringboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDescription {
 
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDescid;
	private int itemid;
	private int quantity;

	public OrderDescription() {
	}

	public OrderDescription(int orderDescid, int itemid, int quantity) {
		this.orderDescid = orderDescid;
		this.itemid = itemid;
		this.quantity = quantity;
	}

	public OrderDescription(int itemid, int quantity) {
		this.itemid = itemid;
		this.quantity = quantity;
	}

	public int getOrderDescid() {
		return orderDescid;
	}

	public void setOrderDescid(int orderDescid) {
		this.orderDescid = orderDescid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderDescription [orderDescid=" + orderDescid + ", itemid=" + itemid + ", quantity=" + quantity + "]";
	}
	
	

}
