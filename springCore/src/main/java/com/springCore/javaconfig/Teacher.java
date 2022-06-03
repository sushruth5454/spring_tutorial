package com.springCore.javaconfig;

public class Teacher {
	private Student student;

	@Override
	public String toString() {
		return "Teacher [student=" + student + "]";
	}

	public Teacher(Student student) {
		super();
		this.student = student;
	}
	
}
