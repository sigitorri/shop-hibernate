package com.accenture.spring;

public class Message implements IMessage {

	IGreetings greet;
	
	/* (non-Javadoc)
	 * @see com.accenture.spring.IMessage#message()
	 */
	public void message() {
		System.out.println(greet.greeting());
	}
	
	public void setGreet(IGreetings greet) {
		this.greet = greet;
	}
}
