package com.saif;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{
	public Object invoke(MethodInvocation mi)throws Throwable {
		Object obj;
		System.out.println("Question starts from here...\n");
		obj = mi.proceed();
		System.out.println("Answer ends here...\n");
		
		return obj;
	}
}
