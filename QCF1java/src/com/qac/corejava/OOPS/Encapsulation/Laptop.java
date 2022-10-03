package com.qac.corejava.OOPS.Encapsulation;

public class Laptop {
	private String brandName;
	private int cost;
	private String color;
	private byte ram;
	
	Laptop(){
		System.out.println("Invoking laptop costructor");
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getCost() {
		return cost;
	}
	public void setcost(int cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setcolor(String color) {
		this.color =color;
	}
	public byte getRam() {
		return ram;
	}
	public void setram(byte ram) {
		this.ram = ram;
	}
}
