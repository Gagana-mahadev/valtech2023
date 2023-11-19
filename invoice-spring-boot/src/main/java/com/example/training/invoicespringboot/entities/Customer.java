package com.example.training.invoicespringboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private int phone;
	private String email;
	private int addressid;

	public Customer() {
	}

	public Customer(int customerId, String customerFirstName, String customerLastName, int phone, String email,
			int addressid) {
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.phone = phone;
		this.email = email;
		this.addressid = addressid;
	}

	public Customer(String customerFirstName, String customerLastName, int phone, String email, int addressid) {
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.phone = phone;
		this.email = email;
		this.addressid = addressid;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", phone=" + phone + ", email=" + email + ", addressid=" + addressid + "]";
	}

}
