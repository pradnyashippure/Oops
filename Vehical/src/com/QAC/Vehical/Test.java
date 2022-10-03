package com.QAC.Vehical;

import com.QAC.Vehical.dao.VehicalDAO;
import com.QAC.Vehical.dto.BikeDTO;

public class Test {
public static void main(String[] args) {
		
		String []features = {"Maxspeed",""};
		
		BikeDTO bike = new BikeDTO();
		bike.setBrandname("Bajaj");
		bike.setColor("RED");
		bike.setPrice(171176);
		bike.setModelname("Pulser RS200");
		bike.setFeatures(features);
		
		BikeDTO bike1 = new BikeDTO();
		bike1.setBrandname("HERO");
		bike1.setColor("RED");
		bike1.setPrice(54355);
		bike1.setModelname("HF Delux");
		bike1.setFeatures(features);
		
		BikeDTO bike2 = new BikeDTO();
		bike2.setBrandname("Honda");
		bike2.setColor("RED");
		bike2.setPrice(112000);
		bike2.setModelname("X-Blade BS6");
		bike2.setFeatures(features);
		
		
		VehicalDAO dao = new VehicalDAO();
		dao.save(bike);
		dao.save(bike1);
		dao.save(bike2);
		dao.save(bike);
		dao.save(bike);
		dao.save(bike);
		dao.save(bike);
		dao.save(bike);
		dao.save(bike);
		dao.save(bike);
		
		dao.print();
		String response = dao.deleteByBrandname("HERO");
		System.out.println(response);
	}

}
