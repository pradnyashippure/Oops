package com.qac.corejava.OOPS.App.dto;

public class MyInstagramDTO extends MyAppDTO {

	private String phoneno;
	private String gender;
	private String dob;
	private String address;
	
	public MyInstagramDTO () {
		System.out.println("Instagram registration");
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
