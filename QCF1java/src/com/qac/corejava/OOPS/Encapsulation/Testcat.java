package com.qac.corejava.OOPS.Encapsulation;

public class Testcat {
	public static void main(String []args) {
		Cat cat = new Cat();
		cat.setcolor("White");
		cat.setnooflegs((byte) 4);
		cat.setGender("Female");
		cat.setnoofeyes((byte) 2);
		System.out.println(cat.getColor());
		System.out.println(cat.getNooflegs());
		System.out.println(cat.getGender());
		System.out.println(cat.getNoofeyes());
	}

}
