package com.qac.corejava.OOPS.Abstraction;


public class WildAnimal implements Animal{

	@Override
	public void walk() {
		System.out.println(" walk");
		}
	@Override
	public void eatfood() {
		System.out.println("eating");
		}
	@Override
	public void hunting() {
		System.out.println("hunting ");
		
	}
	public  WildAnimal() {
		System.out.println("Invoking default constructor of wildanimal class");
	}
	public  WildAnimal(byte nooflegs) {
	this();	
	System.out.println("Invoking byte constructor of wildanimal class");
	}
	public  WildAnimal(String name) {
		this((byte)4);
		System.out.println("Invoking string constructor of wildanimal class");
	}
}
