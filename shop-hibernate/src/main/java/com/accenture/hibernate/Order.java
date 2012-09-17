package com.accenture.hibernate;

import java.io.Serializable;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity
@Table(name = "t_Order")
public class Order implements Serializable {

	   
	@Id
	@GeneratedValue
	private Long id;
	private Long orderNumber;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="customerNumer")
	private Customer customer;
	
	//@Transient
	@ManyToMany(cascade = CascadeType.ALL)//, mappedBy="orders")
	@JoinTable(name = "orderItems")
	private List<Item> items;
		
	private static final long serialVersionUID = 1L;

	public Order() {
		super();
		items = new ArrayList<Item>();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Long getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}      
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Collection<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void add(Item item) {
		this.items.add(item);
	}   
}
