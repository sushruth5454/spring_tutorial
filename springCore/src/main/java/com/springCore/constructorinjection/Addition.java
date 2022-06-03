package com.springCore.constructorinjection;

public class Addition {

	private int a;
	private int b;
	Addition(double a,double b){
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("double double");
	}
	Addition(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("int int");
	}
	void doSum() {
		System.out.println(this.a+"+ "+this.b+" ="+(this.a+this.b));
	}
}
