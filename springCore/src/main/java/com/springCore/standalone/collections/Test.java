package com.springCore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/standalone/collections/aloneconfig.xml");
		Person p1=(Person) context.getBean("person1");
		System.out.println(p1);

	}

}
