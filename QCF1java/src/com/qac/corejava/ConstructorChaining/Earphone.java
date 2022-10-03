package com.qac.corejava.ConstructorChaining;

public class Earphone {
	String brandname;
	int price;
	char color;
	
	public  Earphone() {
		System.out.println("Invoking default costructor");
	}
	public Earphone(String brandname) {
		this(100);
		System.out.println("Invoking string costructor");
	}
	public  Earphone(int price) {
		this();
		System.out.println("Invoking int costructor");
	}
	public  Earphone(char color) {
		System.out.println("Invoking char costructor");
	}

}
