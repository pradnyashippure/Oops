package com.qac.corejava.ConstructorChaining;

public class Fruit {
	String name;
	int price;
	
	public Fruit() {
		this(100);
		System.out.println("Invoking default costructor");
	}
	public Fruit(String name) {
		System.out.println("Invoking string costructor");
	}
	public Fruit(int price) {
		System.out.println("Invoking int costructor");
	}
}
