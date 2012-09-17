package com.accenture.hibernate;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity

public class Item implements Serializable {

	   
	@Id
	@GeneratedValue
	private Long id;
	private long itemNumber;
	private String name;
	private BigDecimal price;
	private static final long serialVersionUID = 1L;
//	
//	@ManyToMany
//	private Collection<Order> orders;

	public Item() {
		super();
//		setOrders(new ArrayList<Order>());
	}
	
	public Item(long itemNumber, String name, BigDecimal price) {
		this();
		this.itemNumber = itemNumber;
		this.name = name;
		this.price = price;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public long getItemNumber() {
		return this.itemNumber;
	}

	public void setItemNumber(long itemNumbder) {
		this.itemNumber = itemNumbder;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal bigDecimal) {
		this.price = bigDecimal;
	}
//	public Collection<Order> getOrders() {
//		return orders;
//	}
//	public void setOrders(Collection<Order> orders) {
//		this.orders = orders;
//	}

   
}
