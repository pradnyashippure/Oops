package com.qac.corejava.OOPS.Abstraction.Upcasting.dto;

public class SonDTO extends FatherDTO {
	private String height = "5feet";
	private String  weight= "30kg";
	
	public SonDTO() {
		System.out.println("Invoking SonDTO constructor");
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	
}
