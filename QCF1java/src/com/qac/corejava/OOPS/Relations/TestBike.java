package com.qac.corejava.OOPS.Relations;

import com.qac.corejava.OOPS.Relations.IsA.BajajPulsar;

public class TestBike {
	public static void main(String [] args) {
		BajajPulsar b = new BajajPulsar();
		b.setBrandname("Bajaj");
		b.setModelname("Pulsar 220F");
		b.setColor("Red");
		b.setCost(130000);
		b.setMaxspeed((byte)120);
		b.setFuel("Petrol");
		
		System.out.println(b.getBrandname());
		System.out.println(b.getModelname());
		System.out.println(b.getColor());
		System.out.println(b.getCost());
		System.out.println(b.getMaxspeed());
		System.out.println(b.getFuel());
	}

}
