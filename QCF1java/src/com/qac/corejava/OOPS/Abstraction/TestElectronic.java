package com.qac.corejava.OOPS.Abstraction;

public class TestElectronic {
	public static void main(String[] args) {
		Smartphone sp = new Smartphone();
		sp.chargeble();
		sp.portable();
		
		int price = 2300;
		int p = ElectronicDevices.affotdable(price);
		System.out.println(p);
		
		
	}

}
