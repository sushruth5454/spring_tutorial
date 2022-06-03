package com.springCore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("112")
	private int id;

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	

}
