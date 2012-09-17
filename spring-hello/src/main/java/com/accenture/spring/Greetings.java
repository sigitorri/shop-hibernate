package com.accenture.spring;

public class Greetings implements IGreetings {

	String greet;
	
	/* (non-Javadoc)
	 * @see com.accenture.spring.IGreetings#greeting()
	 */
	public String greeting() {
		return greet;
	}
	
	/* (non-Javadoc)
	 * @see com.accenture.spring.IGreetings#setGreet(java.lang.String)
	 */
	public void setGreet(String greet) {
		this.greet = greet;
	}
}
