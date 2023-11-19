package com.example.training.invoicespringboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressid;
	private int building_no;
	private String street;
	private String city;
	private String state;
	private String country;
	private int zipCode;
	

	public Address() {
	}

	public Address(int addressid, int building_no, String street, String city, String state, String country,
			int zipCode ) {
		this.addressid = addressid;
		this.building_no = building_no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		
	}

	public Address(int building_no, String street, String city, String state, String country, int zipCode
			) {
		this.building_no = building_no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public int getBuilding_no() {
		return building_no;
	}

	public void setBuilding_no(int building_no) {
		this.building_no = building_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", building_no=" + building_no + ", street=" + street + ", city="
				+ city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
	}

}
