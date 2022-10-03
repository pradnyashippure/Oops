package com.QAC.Watch.DTO;

public class Watchdto {
	private String brandname;
	private String color;
	private int price;

	public Watchdto() {
		System.out.println("Invoking Watchdto constructor");
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	}
	
