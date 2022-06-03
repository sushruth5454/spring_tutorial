package com.springCore.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/loosecoupling/lcconfig.xml");
		Student s1=(Student) context.getBean("student");
		s1.cheat();
		System.out.println(s1);

	}

}
