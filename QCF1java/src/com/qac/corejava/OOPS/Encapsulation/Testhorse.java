package com.qac.corejava.OOPS.Encapsulation;

public class Testhorse {
	public static void main(String []args) {
		Horse horse = new Horse();
		horse.setcolor("White");
		horse.setnooflegs((byte) 4);
		horse.setGender("male");
		horse.setnoofeyes((byte) 2);
		System.out.println(horse.getColor());
		System.out.println(horse.getNooflegs());
		System.out.println(horse.getGender());
		System.out.println(horse.getNoofeyes());
	}

}
