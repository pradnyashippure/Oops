package com.qac.corejava.OOPS.Relations;

import com.qac.corejava.OOPS.Relations.IsA.Rabbit;

public class TestAnimal {
	public static void main(String[] args) {
		
		Rabbit rb = new Rabbit();
		
		rb.setName("Rabbit");
		rb.setColor("White");
		rb.setNoOfLegs((byte)4);
		rb.setNoOfEyes((byte)2);
		rb.setNoOfEars((byte)2);
		rb.setFamily("Leporidae");
		rb.setOrder("Lagomorpha");
		rb.setKingdom("Mammalia");
		
		System.out.println(rb.getName());
		System.out.println(rb.getColor());
		System.out.println(rb.getNoOfLegs());
		System.out.println(rb.getNoOfEyes());
		System.out.println(rb.getNoOfEars());
		System.out.println(rb.getFamily());
		System.out.println(rb.getOrder());
		System.out.println(rb.getKingdom());
		
		
	}

}
