package com.qac.corejava.OOPS.Encapsulation;

public class Testtable {
	public static void main(String []args) {
		Table table = new Table();
		table.setcolor("sky blue");
		table.setnooflegs((byte) 4);
		table.setMaterial("plastic");
		System.out.println(table.getColor());
		System.out.println(table.getNooflegs());
		System.out.println(table.getMaterial());
		
	}


}
