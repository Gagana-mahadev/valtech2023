package com.example.training.invoicespringboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String itemName;
	private String description;
	private float unitPrice;
	private int vendorId;

	public Items() {
	}

	public Items(String itemName, String description, float unitPrice, int vendorId) {
		this.itemName = itemName;
		this.description = description;
		this.unitPrice = unitPrice;
		this.vendorId = vendorId;
	}

	public Items(int itemId, String itemName, String description, float unitPrice, int vendorId) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.description = description;
		this.unitPrice = unitPrice;
		this.vendorId = vendorId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", unitPrice="
				+ unitPrice + ", vendorId=" + vendorId + "]";
	}
	
	

}
