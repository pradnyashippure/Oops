package com.qac.corejava.OOPS.Abstraction;

public class Tiger extends WildAnimal {
	public void walk() {
		System.out.println("is able towalk");
	}
	public void eatfood() {
		System.out.println("some wild animals are vegitarian and some are non vegitarians");
		}
	public void hunting() {
		System.out.println("Non vegitarian animal should always do hunting for food ");
		
	}
	public Tiger() {
		super("tiger");
		System.out.println("tiger constructor");
	}

}
