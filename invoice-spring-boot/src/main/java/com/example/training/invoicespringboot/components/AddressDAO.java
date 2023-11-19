package com.example.training.invoicespringboot.components;

import java.util.List;

import com.example.training.invoicespringboot.entities.Address;

public interface AddressDAO {

	void createAddress(Address address);

	void deleteAddress(int addressid);

	void updateAddress(Address address);

	public long count();

	List<Address> getAllAddress();

	Address getAddress(int addressid);

}
