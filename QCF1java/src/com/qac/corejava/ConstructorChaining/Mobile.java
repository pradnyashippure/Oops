package com.qac.corejava.ConstructorChaining;

public class Mobile {
	String brandname;
	int price;
	char color;
	
	public  Mobile() {
		System.out.println("Invoking default costructor");
	}
	public  Mobile(String brandname) {
		this(100);
		System.out.println("Invoking string costructor");
	}
	public  Mobile(int price) {
		this();
		System.out.println("Invoking int costructor");
	}
	public  Mobile(char color) {
		System.out.println("Invoking char costructor");
	}
}

