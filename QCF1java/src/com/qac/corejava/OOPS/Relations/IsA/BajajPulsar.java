package com.qac.corejava.OOPS.Relations.IsA;

public class BajajPulsar extends Bike {
	private byte maxspeed;
	private String fuel;
	
	public BajajPulsar  () {
		System.out.println("Invoking BajajPulsar  constructor");
	}
	public byte getMaxspeed() {
		return maxspeed;
	}
   public void setMaxspeed(byte maxspeed) {
   this.maxspeed = maxspeed;
   }
   public String getFuel() {
	   return fuel;
   }
   public void setFuel(String fuel) {
	   this.fuel = fuel;
	   
   }

}
