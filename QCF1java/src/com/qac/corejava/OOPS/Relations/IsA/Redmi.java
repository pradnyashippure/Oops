package com.qac.corejava.OOPS.Relations.IsA;

public class Redmi extends Mobile {
	private String color;
	private byte ram;
	
	public Redmi () {
		System.out.println("Invoking redmi note 9 pro constructor");
		}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public byte getRam() {
		return ram;
	}
	public void setRam(byte ram) {
		this.ram = ram;
	}

}
