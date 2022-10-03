package com.QAC.Mobile.dao;

import com.QAC.Mobile.dto.TouchScreenDTO;

public class MobileDAO {
	
		private TouchScreenDTO[] tc =new TouchScreenDTO[10];
		
		private int i;
		public void save(TouchScreenDTO mobile) {
			tc[i++] = mobile;
		}
		public String deleteByBrandname(String brandname) {
			
			for(int i=0; i<tc.length; i++) {
				if(tc[i] !=null && tc[i].getBrandname().equals(brandname)) {
					tc[i] = null;
					return "Deleted "+ brandname;	
				}	
			}
			return "bradname"+brandname+"not present";
			
	}
	public void print() {
		for(int i=0; i<tc.length; i++) {
			System.out.println(tc[i].getBrandname());
			System.out.println(tc[i].getColor());
			System.out.println(tc[i].getPrice());
			System.out.println(tc[i].getModelname());
			System.out.println(tc[i].getFeatures());
			
		}
	}
}
	
