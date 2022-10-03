package com.QAC.Laptop.dao;

import com.QAC.Laptop.dto.DellDTO;

public class LaptopDAO {
	
		private int i = 0;
		private DellDTO[] dell =new DellDTO[10];
		
		public void save(DellDTO mobile) {
			dell[i++] = mobile;
		}
		public String deleteByBrandname(String brandname) {
			
			for(int i=0; i<dell.length; i++) {
				if(dell[i] !=null && dell[i].getBrandname().equals(brandname)) {
					dell[i] = null;
					return "Deleted "+ brandname;	
				}	
			}
			return "bradname"+brandname+"not present";
			
	}
		public void print() {
			for(int i=0; i<dell.length; i++) {
				System.out.println(dell[i].getBrandname());
				System.out.println(dell[i].getColor());
				System.out.println(dell[i].getPrice());
				System.out.println(dell[i].getModelname());
				System.out.println(dell[i].getFeatures());
				
			}
		}

}
