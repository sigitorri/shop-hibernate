package com.accenture.spring;

import java.util.List;

public class Person implements IPerson {

	private int age;
	private String name;
	
	private List<Float> list;
	
	public List<Float> getList() {
		return list;
	}

	public void setList(List<Float> list) {
		this.list = list;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see com.accenture.spring.IPerson#getAge()
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see com.accenture.spring.IPerson#getName()
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
