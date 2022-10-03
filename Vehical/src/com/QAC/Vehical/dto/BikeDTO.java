package com.QAC.Vehical.dto;

public class BikeDTO extends VehicalDTO {
	private String modelname;
	private String  features[];
	
	public BikeDTO() {
		System.out.println("Invoking  BikeDTO constructor");
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
