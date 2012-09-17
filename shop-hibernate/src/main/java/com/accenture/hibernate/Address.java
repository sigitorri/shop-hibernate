package com.accenture.hibernate;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: Adress
 *
 */

public class Address implements Serializable {

	private long id;
	//@Column(nullable = false)
	private String street;
	private String houseNumber;
	private String zipCode;
	private String city;
	private static final long serialVersionUID = 1L;

	public Address() {
		super();
	} 
	
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}   
	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}   
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}   
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}
   
}
