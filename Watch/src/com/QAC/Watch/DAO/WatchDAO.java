package com.QAC.Watch.DAO;

import com.QAC.Watch.DTO.SmartWatchdto;

public class WatchDAO {
	private SmartWatchdto [] smartwatches =new SmartWatchdto[10];
	
	private int i = 0;
	public void save(SmartWatchdto watch) {
		smartwatches[i++] = watch;
	}
	public String deleteByBrandname(String brandname) {
		
		for(int i=0; i<smartwatches.length; i++) {
			if(smartwatches[i] !=null && smartwatches[i].getBrandname().equals(brandname)) {
				smartwatches[i] = null;
				return "Deleted "+ brandname;
				
			}
			
		}
		return "bradname"+brandname+"not present";
		
	}
	public void print() {
		for(int i=0; i<smartwatches.length; i++) {
			System.out.println(smartwatches[i].getBrandname());
			System.out.println(smartwatches[i].getColor());
			System.out.println(smartwatches[i].getPrice());
			System.out.println(smartwatches[i].getDisplay());
			System.out.println(smartwatches[i].getFeatures());
			
		}
	}
}
