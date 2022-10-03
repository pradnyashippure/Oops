package com.QAC.Laptop;

import com.QAC.Laptop.dao.LaptopDAO;
import com.QAC.Laptop.dto.DellDTO;

public class Test {
public static void main(String[] args) {
		
		String []features = {"APPS","savefile"};
		
		DellDTO lp = new DellDTO();
		lp.setBrandname("Dell");
		lp.setColor("Black");
		lp.setPrice(25999);
		lp.setModelname("Vostro");
		lp.setFeatures(features);
		
		DellDTO lp1 = new DellDTO();
		lp1.setBrandname("HP");
		lp1.setColor("silver");
		lp1.setPrice(36500);
		lp1.setModelname("Elitebook");
		lp1.setFeatures(features);
		
		DellDTO lp2 = new DellDTO();
		lp2.setBrandname("DELL");
		lp2.setColor("silver");
		lp2.setPrice(68989);
		lp2.setModelname("Inspiron");
		lp2.setFeatures(features);
		
		DellDTO lp3 = new DellDTO();
		lp3.setBrandname("DELL");
		lp3.setColor("silver");
		lp3.setPrice(99990);
		lp3.setModelname("XPS 13");
		lp3.setFeatures(features);
		
		LaptopDAO dao = new LaptopDAO();
		dao.save(lp);
		dao.save(lp1);
		dao.save(lp2);
		dao.save(lp3);
		dao.save(lp);
		dao.save(lp1);
		dao.save(lp2);
		dao.save(lp3);
		dao.save(lp);
		dao.save(lp2);
		
		dao.print();
		
		String response = dao.deleteByBrandname("HP");
		System.out.println(response);
	}

}
