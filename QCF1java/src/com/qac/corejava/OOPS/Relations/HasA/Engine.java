package com.qac.corejava.OOPS.Relations.HasA;

public class Engine {
private String brandName;
private byte noofstrokes;
private short capacity;

public Engine() {
	System.out.println("Invoking engine constructor");
}
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public byte getNoofstrokes() {
	return noofstrokes;
}
public void setNoofstrokes(byte noofstrokes) {
	this.noofstrokes = noofstrokes;
}
public short getCapacity() {
	return capacity;
}
public void setCapacity(short capacity) {
	this.capacity = capacity;
}
}
