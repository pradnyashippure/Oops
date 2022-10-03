package com.qac.corejava.OOPS.Relations.IsA.Methodoverriding;

public class Laboratory {
   String name;
   String location;
   
   public String doingexperiment() {
	   System.out.println("Doing chemical experiment");
	   return "result";
   }
   public String writingrecord(String expname) {
	   System.out.println("Writing a chemistry record");
	   return "Record";
	   
   }
   
}
