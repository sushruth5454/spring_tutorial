package com.springCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String []args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifeconfig.xml");
		Samosa sam=(Samosa) context.getBean("samosa");
		System.out.println(sam.getPrice());
		
		
		//to call destroy we need to use registerShutdownHook but it is not available in ApplicationContext it is available in AbstractApplicationContext
		AbstractApplicationContext context1=new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifeconfig.xml");
		Samosa sam2=(Samosa) context1.getBean("samosa");
		System.out.println(sam.getPrice());
		context1.registerShutdownHook();
		
		ApplicationContext context2=new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifeconfig.xml");
		Pepsi p1=(Pepsi) context.getBean("pepsi");
		System.out.println(p1);
		
		
		Pizza pizza=(Pizza) context2.getBean("pizza");
		System.out.println(pizza.getPrice());
		
	}

}
