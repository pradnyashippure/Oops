package com.qac.corejava.OOPS.Relations.IsA;

public class Rabbit extends Animal {
	private byte noOfEars;
	private String Family;
	private String order;
	private String kingdom;
	
	public Rabbit () {
		System.out.println("Studying about a rabbit");
		
	}

	public byte getNoOfEars() {
		return noOfEars;
	}

	public void setNoOfEars(byte noOfEars) {
		this.noOfEars = noOfEars;
	}

	public String getFamily() {
		return Family;
	}

	public void setFamily(String family) {
		Family = family;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getKingdom() {
		return kingdom;
	}

	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}
	

}
