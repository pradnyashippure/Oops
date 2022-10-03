package com.qac.corejava.OOPS.Relations.IsA.Methodoverriding;

public class Myhome extends House {
	String color;
	byte noOfMembers;
	
	public String cooking(String food) {
		System.out.println("preparing rice");
		return "food";
		}

}
