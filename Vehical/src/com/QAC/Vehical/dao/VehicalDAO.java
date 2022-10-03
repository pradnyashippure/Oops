package com.QAC.Vehical.dao;

import com.QAC.Vehical.dto.BikeDTO;

public class VehicalDAO {
	private BikeDTO[] bk =new BikeDTO[10];
	
	private int i=0;
	public void save(BikeDTO bike) {
		 bk[i++] = bike;
	}
	public String deleteByBrandname(String brandname) {
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i] !=null && bk[i].getBrandname().equals(brandname)) {
				bk[i] = null;
				return "Deleted "+ brandname;	
			}	
		}
		return "bradname "+brandname+" not present";
		
}
	public void print() {
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].getBrandname());
			System.out.println(bk[i].getColor());
			System.out.println(bk[i].getPrice());
			System.out.println(bk[i].getModelname());
			System.out.println(bk[i].getFeatures());
			
		}
	}
}
