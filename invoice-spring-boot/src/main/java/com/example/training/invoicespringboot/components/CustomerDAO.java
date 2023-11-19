package com.example.training.invoicespringboot.components;

import java.util.List;

import com.example.training.invoicespringboot.entities.Customer;

public interface CustomerDAO {

	void deleteCustomer(int customerId);

	void updateCustomer(Customer customer);

	void createCustomer(Customer customer);

	public long count();

	List<Customer> getAllCustomer();

	Customer getCustomer(int customerId);

}
