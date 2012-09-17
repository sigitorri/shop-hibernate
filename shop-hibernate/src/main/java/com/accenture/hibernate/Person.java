package com.accenture.hibernate;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity

public class Person implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private SalutationType salutation;
	
	public enum SalutationType{Mr}
	
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public SalutationType getSalutation() {
		return this.salutation;
	}

	public void setSalutation(SalutationType salutation) {
		this.salutation = salutation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
   
}
