package com.qac.corejava.ConstructorChaining;

public class Apple extends Fruit {
	String color;
	
	public Apple() {
		super(100);
		System.out.println("Invoking default costructor of apple class");
		}
	public static void main(String[] args) {
		Apple apple = new Apple();
		
	}

}
