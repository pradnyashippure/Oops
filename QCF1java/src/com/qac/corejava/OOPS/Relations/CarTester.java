package com.qac.corejava.OOPS.Relations;

import com.qac.corejava.OOPS.Relations.IsA.MahindraThar;

public class CarTester {
	public static void main(String [] args) {
		MahindraThar car = new MahindraThar();
		car.setBrandname("Mahindra");
		car.setModelname("Thar");
		car.setColor("Red");
		car.setCost(1450000);
		car.setNoofseat((byte)4);
		car.setMaxspeed((byte)120);
		car.setFuel("Diesel");
		
		System.out.println(car.getBrandname());
		System.out.println(car.getModelname());
		System.out.println(car.getColor());
		System.out.println(car.getCost());
		System.out.println(car.getNoofseat());
		System.out.println(car.getMaxspeed());
		System.out.println(car.getFuel());
	}

}
