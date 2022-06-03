package com.springCore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String []args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/autowire/autowireconfig.xml");
		Emp emp=(Emp) context.getBean("emp");
		System.out.println(emp);
		
	}

}
