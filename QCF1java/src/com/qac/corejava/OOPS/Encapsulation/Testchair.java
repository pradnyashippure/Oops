package com.qac.corejava.OOPS.Encapsulation;

public class Testchair {
	public static void main(String []args) {
		Chair chair = new Chair();
		chair.setcolor("Red");
		chair.setnooflegs((byte) 4);
		chair.setMaterial("plastic");
		System.out.println(chair.getColor());
		System.out.println(chair.getNooflegs());
		System.out.println(chair.getMaterial());
	}
		

}
