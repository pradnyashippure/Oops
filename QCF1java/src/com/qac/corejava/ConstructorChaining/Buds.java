package com.qac.corejava.ConstructorChaining;

public class Buds extends Earphone {
String color;

	
	public Buds() {
		super('P');
		System.out.println("Invoking default constructor of buds class");

}
	public static void main(String [] args) {
		Buds buds = new Buds();
	
	}
}
