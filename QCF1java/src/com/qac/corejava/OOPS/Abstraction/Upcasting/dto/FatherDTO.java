package com.qac.corejava.OOPS.Abstraction.Upcasting.dto;

public class FatherDTO {
	private String name = "Prakash";
	private byte age = 45;
	
	public FatherDTO() {
		System.out.println("Father constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

}
