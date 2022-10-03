package com.qac.corejava.ConstructorChaining;

public class Pen {
String name;
int price;

public Pen() {
	this(100);
	System.out.println("Invoking default costructor");
}
public Pen(String name) {
	System.out.println("Invoking string costructor");
}
public Pen(int price) {
	System.out.println("Invoking int costructor");
}

}
