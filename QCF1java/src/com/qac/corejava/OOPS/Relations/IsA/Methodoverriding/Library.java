package com.qac.corejava.OOPS.Relations.IsA.Methodoverriding;

public class Library {
	String name;
	int noOfBook;
	String location;
	
	public void readingbook() {
		System.out.println("Reading a book in library");
	}
	public String searchingbook() {
		System.out.println("Searching a Wings of fire book");
		return "Wings of fire";
	}
}
