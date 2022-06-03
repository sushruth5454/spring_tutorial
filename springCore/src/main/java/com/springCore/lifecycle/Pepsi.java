package com.springCore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void destroy() throws Exception {
		System.out.println("destroy method pepsi");
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method pepsi");
		// TODO Auto-generated method stub
		
	}
	

}
