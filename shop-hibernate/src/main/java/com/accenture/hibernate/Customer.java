package com.accenture.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity
@Table(name = "t_Customer")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Customer extends Person implements Serializable {

	//private Long id;
	private int taxNumber;
	private Boolean goldStatus;
	
	//@Transient
	@OneToOne
	private Address address;
	
	//@Transient
	@OneToMany(mappedBy="customer")
	private List<Order> orders;
	
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
		orders = new ArrayList<Order>();
	}    
	public int getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(int i) {
		this.taxNumber = i;
	}   
	public Boolean getGoldStatus() {
		return this.goldStatus;
	}

	public void setGoldStatus(Boolean goldStatus) {
		this.goldStatus = goldStatus;
	}   
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> o) {
		this.orders = o;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address adress) {
		this.address = adress;
	}
   
}
