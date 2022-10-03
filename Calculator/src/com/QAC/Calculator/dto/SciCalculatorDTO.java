package com.QAC.Calculator.dto;

public class SciCalculatorDTO extends CalculatorDTO {
	private String display;
	private String features[];
	
	public SciCalculatorDTO() {
		System.out.println("Invoking SciCalculator constructor");
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String[] getFeatures() {
		return features;
	}

	public void setFeatures(String features[]) {
		this.features = features;
	}

}
