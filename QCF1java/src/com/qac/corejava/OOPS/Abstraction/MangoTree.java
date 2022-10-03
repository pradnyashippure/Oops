package com.qac.corejava.OOPS.Abstraction;

public class MangoTree implements Tree {

	@Override
	public void growing() {
		System.out.println("It will grow ");
		
	}

	@Override
	public void giveflower() {
		System.out.println("It will give a flower");
		
		}

	@Override
	public void givefruit() {
		System.out.println("It will give a fruit mango");
		
	}

}
