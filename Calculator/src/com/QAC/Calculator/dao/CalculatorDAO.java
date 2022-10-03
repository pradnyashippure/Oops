package com.QAC.Calculator.dao;

import com.QAC.Calculator.dto.SciCalculatorDTO;

public class CalculatorDAO {
		private SciCalculatorDTO [] Scicalculator = new SciCalculatorDTO[10];
		
	
	private int i=0;	
		public void save(SciCalculatorDTO calculator) {
			Scicalculator[i++] = calculator;
		}
		public String deleteByBrandname(String brandname) {
			
			for(int i=0; i<Scicalculator.length; i++) {
				if(Scicalculator[i] !=null && Scicalculator[i].getBrandname().equals(brandname)) {
					Scicalculator[i] = null;
					return "Deleted "+ brandname;
					
				}
				
			}
			return "bradname "+brandname+" not present";
			
		}
		public void print() {
			for(int i=0; i<Scicalculator.length; i++) {
				System.out.println(Scicalculator[i].getBrandname());
				System.out.println(Scicalculator[i].getColor());
				System.out.println(Scicalculator[i].getPrice());
				System.out.println(Scicalculator[i].getDisplay());
				System.out.println(Scicalculator[i].getFeatures());
				
			}
		}
}



