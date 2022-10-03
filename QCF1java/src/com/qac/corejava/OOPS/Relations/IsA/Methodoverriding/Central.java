package com.qac.corejava.OOPS.Relations.IsA.Methodoverriding;

public class Central extends Library {
	boolean isPublic;
	String timing;
	byte reviews;
	
	public void readingbook() {
		System.out.println("Reading a book in library online");
	}
	public String searchingbook() {
		System.out.println("Searching a Wings of fire book");
		return "Wings of fire";
	}
}
