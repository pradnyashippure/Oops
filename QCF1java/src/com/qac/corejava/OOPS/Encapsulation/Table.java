package com.qac.corejava.OOPS.Encapsulation;

public class Table {
	private String color;
	private byte nooflegs;
	private String material;
	
	
	Table(){
		System.out.println("Invoking table costructor");
	}
public String getColor() {
	return color;
}
public void setcolor(String color) {
	this.color = color;
	
}
public byte getNooflegs() {
	return nooflegs;
}
public void setnooflegs(byte nooflegs) {
	this.nooflegs = nooflegs;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
	
}

}
