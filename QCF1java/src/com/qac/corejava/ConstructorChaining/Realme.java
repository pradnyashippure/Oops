package com.qac.corejava.ConstructorChaining;

public class Realme extends Mobile {
	String color;

	
	public Realme() {
		super("realme");
		System.out.println("Invoking default constructor of realme class");

}
	public static void main(String [] args) {
		Realme realme = new Realme();
	
	}
}
