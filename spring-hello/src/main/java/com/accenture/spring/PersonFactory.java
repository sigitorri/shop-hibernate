package com.accenture.spring;

public class PersonFactory {

	public static Person createPersonWithStaticMethod(){
		return new Person();
	};
	public Person createPersonWithInstanceMethod() {
		return new Person();
	};
}
