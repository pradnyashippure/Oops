package com.qac.corejava.OOPS.Relations.IsA.Methodoverriding;

public class Crow extends Bird {
  String color;
  byte noOfLegs;
  public void flying () {
		System.out.println("Crow is flying in a sky ");
	} 
  public void sitting () {
		System.out.println("Crow is sitting on a neem tree");
	} 
}
