package com.qac.corejava.OOPS.Abstraction.Upcasting.dao;

public class SonDAO implements FatherDAO,MotherDAO {
	
	@Override
	public void ishousewife() {
		System.out.println("My mother is housewife");		
	}

	@Override
	public void isgoodcook() {
		System.out.println("She is cooking a rice");
		
	}

	@Override
	public void isprofessor() {
		System.out.println("My father is professor");
		
	}

	@Override
	public void isreading() {
		System.out.println("He is reading a newspaper");
		
	}
	public SonDAO() {
		System.out.println("Son is in 9th standard");
	}
}
