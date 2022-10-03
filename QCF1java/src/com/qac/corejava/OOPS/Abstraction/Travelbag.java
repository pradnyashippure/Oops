package com.qac.corejava.OOPS.Abstraction;

public class Travelbag implements Bag {

	@Override
	public void tostoreclothes() {
		System.out.println("used to store the clothes");
		}
	@Override
	public void tostorejwellery() {
		System.out.println("used to store the jwellery");
		}

	@Override
	public void storetiffinbox() {
		System.out.println("used to store the tiffinbox ,waterbottle,snacks etc");
		}
	public Travelbag() {
		this(20);
		System.out.println("Invoking travelbag default constructor");
	}
	public Travelbag(String bg) {
		System.out.println("Invoking travelbag String constructor");
	}
	public Travelbag(int i) {
		this("bag");
		System.out.println("Invoking travelbag int constructor");
	}


}
