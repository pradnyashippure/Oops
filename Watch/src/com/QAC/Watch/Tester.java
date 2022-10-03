package com.QAC.Watch;

import com.QAC.Watch.DAO.WatchDAO;
import com.QAC.Watch.DTO.SmartWatchdto;

public class Tester {
	public static void main(String[] args) {
		
		String []features = {"Calling","Sport"};
		
		SmartWatchdto watch = new SmartWatchdto();
		watch.setBrandname("Boat");
		watch.setColor("Gray");
		watch.setPrice(2000);
		watch.setDisplay("LED");
		watch.setFeatures(features);
		
		SmartWatchdto watch1 = new SmartWatchdto();
		watch1.setBrandname("Realme");
		watch1.setColor("Black");
		watch1.setPrice(1599);
		watch1.setDisplay("LED");
		watch1.setFeatures(features);
		
		SmartWatchdto watch2 = new SmartWatchdto();
		watch2.setBrandname("Fastrack");
		watch2.setColor("Light pink");
		watch2.setPrice(2295);
		watch2.setDisplay("LED");
		watch2.setFeatures(features);
		
		SmartWatchdto watch3 = new SmartWatchdto();
		watch3.setBrandname("Samsung");
		watch3.setColor("Gray");
		watch3.setPrice(32999);
		watch3.setDisplay("LED");
		watch3.setFeatures(features);
		
		SmartWatchdto watch4 = new SmartWatchdto();
		watch4.setBrandname("Fire-Boltt");
		watch4.setColor("Blue");
		watch4.setPrice(1499);
		watch4.setDisplay("LED");
		watch4.setFeatures(features);
		
		SmartWatchdto watch5 = new SmartWatchdto();
		watch5.setBrandname("Waylon");
		watch5.setColor("Blue Fog");
		watch5.setPrice(1299);
		watch5.setDisplay("LED");
		watch5.setFeatures(features);
		
		SmartWatchdto watch6 = new SmartWatchdto();
		watch6.setBrandname("MITTAL ENT");
		watch6.setColor("Black");
		watch6.setPrice(999);
		watch6.setDisplay("LED");
		watch6.setFeatures(features);
		
		WatchDAO dao = new WatchDAO();
		dao.save(watch);
		dao.save(watch1);
		dao.save(watch2);
		dao.save(watch3);
		dao.save(watch4);
		dao.save(watch5);
		dao.save(watch6);
		dao.save(watch);
		dao.save(watch1);
		dao.save(watch5);
		
		dao.print();
		
		String response = dao.deleteByBrandname("Boat");
		System.out.println(response);
	}
	
}
