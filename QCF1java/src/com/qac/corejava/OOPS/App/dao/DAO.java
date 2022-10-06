package com.qac.corejava.OOPS.App.dao;

import com.qac.corejava.OOPS.App.dto.Details;

public class DAO  {

	Details [] details = new Details[10];
	int i = 0;
	public void register(Details d ) {
    details[i++] = d;
		
	}
	public String login(String email,String password) {
		for(int i = 0; i<details.length; i++) {
			if(details[i]!=null && details[i].getEmail().equals(email) && details[i].getPassword().equals(password)) {
				return "Login successfully";
				}
			}
		return "Login failed";
		
	}
	public String deleteaccount(String email) {
		for(int i=0; i<details.length; i++) {
			if(details[i] !=null && details[i].getEmail().equals(email)) {
				details[i] = null;
				return "Deleted "+ email;
				}
			}
		return  email +"not registered";
	}
}
