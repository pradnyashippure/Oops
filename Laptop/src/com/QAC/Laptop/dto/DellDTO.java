package com.QAC.Laptop.dto;

public class DellDTO extends LaptopDTO {
	private String modelname;
	private String  features[];
	
	public DellDTO() {
		System.out.println("Invoking DellDTO constructor");
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public String[] getFeatures() {
		return features;
	}
	public void setFeatures(String features[]) {
		this.features = features;
	}


}
