package com.qac.corejava.OOPS.Relations.IsA;

public class MahindraThar extends Car {
	private byte maxspeed;
	private String fuel;
	
	public MahindraThar () {
		System.out.println("Invoking mahindrathar constructor");
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
