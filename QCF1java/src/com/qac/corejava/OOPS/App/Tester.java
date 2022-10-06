package com.qac.corejava.OOPS.App;

import com.qac.corejava.OOPS.App.dao.DAO;
import com.qac.corejava.OOPS.App.dto.Details;

public class Tester {
	public static void main(String[] args) {

		Details d = new Details();
		d.setFullname("Pradnya Shippure");
		d.setEmail("pannu03@gmail.com");
		d.setPassword("Pradnya123*");
		d.setConfirmpassword("Pradnya123*");
		d.setContact(890789075);
		d.setGender("Female");
		d.setLocation("Mamadapur(k,l)");
		d.setDateofbirth("03-Jun-2000");
		
		Details d1 = new Details();
		d1.setFullname("Sanvi Patil");
		d1.setEmail("sanvi@gmail.com");
		d1.setPassword("sa01");
		d1.setConfirmpassword("sa01");
		d1.setContact(890700111);
		d1.setGender("Female");
		d1.setLocation("Belagavi");
		d1.setDateofbirth("12-Jun-2002");
		
		Details d2 = new Details();
		d2.setFullname("Kavya Magdum");
		d2.setEmail("kavi@gmail.com");
		d2.setPassword("kavu45");
		d2.setConfirmpassword("kavu45");
		d2.setContact(900700111);
		d2.setGender("Female");
		d2.setLocation("Kolhapur");
		d2.setDateofbirth("19-Jan-2004");
		
		Details d3 = new Details();
		d3.setFullname("Naman Agarwal");
		d3.setEmail("naman98@gmail.com");
		d3.setPassword("Na9090");
		d3.setConfirmpassword("Na9090");
		d3.setContact(896565111);
		d3.setGender("Male");
		d3.setLocation("Jaipur");
		d3.setDateofbirth("12-May-2000");
		
		DAO dao = new DAO();
		dao.register(d);
		dao.register(d1);
		dao.register(d2);
		dao.register(d3);

		
	String response = dao.login ("naman98@gmail.com","Na9090");
	System.out.println(response);
	
	String result = dao.deleteaccount("sanvi@gmail.com");
	System.out.println(result);
	
       }
	}
