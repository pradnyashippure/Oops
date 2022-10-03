package com.QAC.Watch.DTO;

public class SmartWatchdto extends Watchdto {
	private String display;
	private String features[];
	
	public SmartWatchdto() {
		System.out.println("Invoking smarthwatch constructor");
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
