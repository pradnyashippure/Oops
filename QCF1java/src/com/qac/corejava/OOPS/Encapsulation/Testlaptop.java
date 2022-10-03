package com.qac.corejava.OOPS.Encapsulation;

public class Testlaptop {
	public static void main(String []args) {
		Laptop lap= new Laptop();
		lap.setBrandName("DELL");
		lap.setcost( 35999);
		lap.setcolor("Black");
		lap.setram((byte) 16);
		System.out.println(lap.getBrandName());
		System.out.println(lap.getCost());
		System.out.println(lap.getColor());
		System.out.println(lap.getRam());
	}
}
