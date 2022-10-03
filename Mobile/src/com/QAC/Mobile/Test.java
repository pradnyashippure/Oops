package com.QAC.Mobile;

import com.QAC.Mobile.dao.MobileDAO;
import com.QAC.Mobile.dto.TouchScreenDTO;

public class Test {
public static void main(String[] args) {
		
		String []features = {"Calling","Messaging"};
		
		TouchScreenDTO mobile = new TouchScreenDTO();
		mobile.setBrandname("Samsung");
		mobile.setColor("FOREST Green");
		mobile.setPrice(11999);
		mobile.setModelname("F23");
		mobile.setFeatures(features);
		
		TouchScreenDTO mobile1 = new TouchScreenDTO();
		mobile1.setBrandname("Realme");
		mobile1.setColor("Stargaze White");
		mobile1.setPrice(15999);
		mobile1.setModelname("9 pro");
		mobile1.setFeatures(features);
		
		TouchScreenDTO mobile2 = new TouchScreenDTO();
		mobile2.setBrandname("Redme");
		mobile2.setColor("Glacier White");
		mobile2.setPrice(14499);
		mobile2.setModelname("note 9 pro");
		mobile2.setFeatures(features);
		
		TouchScreenDTO mobile3 = new TouchScreenDTO();
		mobile3.setBrandname("Motorola");
		mobile3.setColor("Charcoal Gray");
		mobile3.setPrice(16999);
		mobile3.setModelname("Moto G52");
		mobile3.setFeatures(features);

		
		MobileDAO dao = new MobileDAO();
		dao.save(mobile);
		dao.save(mobile1);
		dao.save(mobile2);
		dao.save(mobile3);
		dao.save(mobile1);
		dao.save(mobile2);
		dao.save(mobile3);
		dao.save(mobile);
		dao.save(mobile1);
		dao.save(mobile3);
		dao.print();
		
		
		
		
		String response = dao.deleteByBrandname("Samsung");
		System.out.println(response);
	}
	

}
