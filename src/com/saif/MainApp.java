package com.saif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Questions q3 = (Questions)context.getBean("p3");
		q3.display();
		
		Questions q = (Questions)context.getBean("p");
		q.display();
		
		Questions q2 = (Questions)context.getBean("p2");
		q2.display();
	}
}
