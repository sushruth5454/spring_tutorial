package com.springCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Pizza(double price) {
	super();
	this.price = price;
}

public Pizza() {
	super();
	// TODO Auto-generated constructor stub
}
@PostConstruct
public void start() {
	System.out.println("intializing pizza...");
}

@PreDestroy
public void end() {
	System.out.println("Destroying pizza...");
}
}
