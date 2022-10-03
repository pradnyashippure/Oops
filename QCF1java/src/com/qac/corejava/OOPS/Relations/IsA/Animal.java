package com.qac.corejava.OOPS.Relations.IsA;

public class Animal {
	private String name;
	private String color;
	private byte noOfLegs;
	private byte NoOfEyes;
	
	public Animal() {
		System.out.println("doing study on animal");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public byte getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(byte noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public byte getNoOfEyes() {
		return NoOfEyes;
	}
	public void setNoOfEyes(byte noOfEyes) {
		NoOfEyes = noOfEyes;
	}
	
	
	

}
