package com.springCore.constructorinjection;

public class Certi {
	private String college;

	@Override
	public String toString() {
		return "Certi [college=" + college + "]";
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Certi(String college) {
		super();
		this.college = college;
	}

	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
