package com.qac.corejava.OOPS.App.dao;

import com.qac.corejava.OOPS.App.dto.AppDTO;
import com.qac.corejava.OOPS.App.dto.MyInstagramDTO;

public class MyInstagramDAO implements AppDTO{
	
	MyInstagramDTO [] insta = new MyInstagramDTO[10];
	
	int i = 0;
	public void register(MyInstagramDTO my) {
		insta[i++] =my ;
		}
	
	public String login(String emailid,String password) {
		
		for(int i = 0; i<insta.length; i++) {
			if(insta[i]!=null && insta[i].getEmailid().equals(emailid) && insta[i].getPassword().equals(password)) {
				return "Login successfully";
				}
			}
		return "Login failed";
	}

    public String deletemyaccount(String emailid) {
		for(int i=0; i<insta.length; i++) {
			if(insta[i] !=null && insta[i].getEmailid().equals(emailid)) {
				insta[i] = null;
				return "Deleted "+ emailid;
			}
		}
		return emailid +" not registered";
	}

	@Override
	public void collection() {
		System.out.println("Collecting data");
		}

	@Override
	public void manage() {
		System.out.println("Managing data");
	}
		
		
}
