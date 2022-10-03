package com.QAC.Mobile.dto;

public class TouchScreenDTO extends MobileDTO {
	private String modelname;
	private String  features[];
	
	public TouchScreenDTO() {
		System.out.println("Invoking TouchScreenDTO constructor");
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
