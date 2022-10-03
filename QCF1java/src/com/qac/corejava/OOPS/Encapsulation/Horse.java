package com.qac.corejava.OOPS.Encapsulation;

public class Horse {
	private String color;
	private byte nooflegs;
	private String gender;
	private byte noofeyes;
	
	Horse(){
		System.out.println("Horse");
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
	
}
public byte getNoofeyes() {
	return noofeyes;
}
public void setnoofeyes(byte noofeyes) {
	this.noofeyes = noofeyes;
}

}
