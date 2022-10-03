package com.QAC.Laptop.dto;

public class LaptopDTO {
	private String brandname;
	private String color;
	private int price;

	public LaptopDTO() {
		System.out.println("Invoking LaptopDTO constructor");
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
