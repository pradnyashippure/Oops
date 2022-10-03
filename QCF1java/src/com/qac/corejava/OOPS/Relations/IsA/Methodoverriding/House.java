package com.qac.corejava.OOPS.Relations.IsA.Methodoverriding;

public class House {
	String name;
	String location;
	byte noOfRooms;
	
	public String cooking(String food) {
	System.out.println("cooking in home");
	return "food";
	}
	public void sleeping() {
		System.out.println("sleeping in home");
	}

}
