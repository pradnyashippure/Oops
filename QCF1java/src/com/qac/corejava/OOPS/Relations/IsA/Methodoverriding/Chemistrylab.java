package com.qac.corejava.OOPS.Relations.IsA.Methodoverriding;

public class Chemistrylab extends Laboratory {
	byte noOfChemicals;
	byte noOfInstruments;
	
	 public String doingexperiment() {
		   System.out.println("Doing titration");
		   return "result";
	   }
	   public String writingrecord(String expname) {
		   System.out.println("Writing a chemistry record of experiment number 2");
		   return "Record";   
	   }
}
