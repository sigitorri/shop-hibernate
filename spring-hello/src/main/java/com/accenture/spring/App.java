package com.accenture.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factoryParent = new ClassPathXmlApplicationContext("application.xml");
    	ApplicationContext factoryChild = new ClassPathXmlApplicationContext(new String [] {"child.xml"}, factoryParent);
    	
//    	IGreetings greetings = (IGreetings) factoryParent.getBean("greeti");
    	
//    	System.out.println(greetings.greeting());
    	
//    	IMessage mess = factoryChild.getBean("messi", IMessage.class);
//    	mess.message();
    	
    	System.out.println(( (Person) factoryParent.getBean("personBean")).getName());
    	
    	System.out.println(( (Person) factoryParent.getBean("personBean")).getList().get(0));
    	
    	IMessage mess = factoryChild.getBean("mP", IMessage.class);
    	mess.message();
    	
    }
}
