package com.example.training.invoicespringboot.components;

import java.util.List;

import com.example.training.invoicespringboot.entities.Vendors;

public interface VendorsDAO {

	void createVendor(Vendors vendor);

	void updateVendor(Vendors vendor);

	void deleteVendor(int vendorid);

	public long count();

	List<Vendors> getAllVendors();
	
	Vendors getVendor(int vendorid);

}
