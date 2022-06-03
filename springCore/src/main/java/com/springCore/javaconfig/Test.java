package com.springCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1=context.getBean("student",Student.class);
		System.out.println(s1);
		
		Teacher t=(Teacher) context.getBean("getTeacher");
		System.out.println(t);
		
		

	}

}
