package com.accenture.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation arg0) throws Throwable {
			System.out.println(arg0.getMethod());
		return arg0.proceed();
	}

}
