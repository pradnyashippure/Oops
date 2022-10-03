package com.QAC.Calculator;

import com.QAC.Calculator.dao.CalculatorDAO;
import com.QAC.Calculator.dto.SciCalculatorDTO;

public class Test {
	
public static void main(String[] args) {
		
		String []features = {"Trignometric","logarithmic"};
		
		SciCalculatorDTO  scicalculator = new SciCalculatorDTO();
		scicalculator.setBrandname("Casio");
		scicalculator.setColor("Gray");
		scicalculator.setPrice(1000);
		scicalculator.setDisplay("LCD");
		scicalculator.setFeatures(features);
		
		SciCalculatorDTO scicalculator1 = new SciCalculatorDTO();
		scicalculator1.setBrandname("OREVA");
		scicalculator1.setColor("Blue");
		scicalculator1.setPrice(489);
		scicalculator1.setDisplay("LCD");
		scicalculator1.setFeatures(features);
		
		SciCalculatorDTO scicalculator2 = new SciCalculatorDTO();
		scicalculator2.setBrandname("BAMBALIO");
		scicalculator2.setColor("Blue");
		scicalculator2.setPrice(138);
		scicalculator2.setDisplay("LCD");
		scicalculator2.setFeatures(features);
		
		
		CalculatorDAO dao = new CalculatorDAO();
		dao.save(scicalculator);
		dao.save(scicalculator1);
		dao.save(scicalculator2);
		dao.save(scicalculator);
		dao.save(scicalculator1);
		dao.save(scicalculator2);
		dao.save(scicalculator);
		dao.save(scicalculator1);
		dao.save(scicalculator2);
		dao.save(scicalculator);
		dao.print();
		
		
		String response = dao.deleteByBrandname("OREVA");
		System.out.println(response);
	}

}
