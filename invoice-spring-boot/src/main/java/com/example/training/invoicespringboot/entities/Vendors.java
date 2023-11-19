package com.example.training.invoicespringboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendors {
 
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	private String vendorName;
	private int vendorPhone;
	private String vendorEmail;
	private int vendorAddress;

	public Vendors() {
	}

	public Vendors(String vendorName, int vendorPhone, String vendorEmail, int vendorAddress) {
		this.vendorName = vendorName;
		this.vendorPhone = vendorPhone;
		this.vendorEmail = vendorEmail;
		this.vendorAddress = vendorAddress;
	}

	public Vendors(int vendorId, String vendorName, int vendorPhone, String vendorEmail, int vendorAddress) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorPhone = vendorPhone;
		this.vendorEmail = vendorEmail;
		this.vendorAddress = vendorAddress;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public int getVendorPhone() {
		return vendorPhone;
	}

	public void setVendorPhone(int vendorPhone) {
		this.vendorPhone = vendorPhone;
	}

	public String getVendorEmail() {
		return vendorEmail;
	}

	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}

	public int getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(int vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	@Override
	public String toString() {
		return "Vendors [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorPhone=" + vendorPhone
				+ ", vendorEmail=" + vendorEmail + ", vendorAddress=" + vendorAddress + "]";
	}
	
	

}
