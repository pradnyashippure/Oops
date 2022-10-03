package com.qac.corejava.OOPS.Abstraction.Upcasting;

import com.qac.corejava.OOPS.Abstraction.Upcasting.dao.FatherDAO;
import com.qac.corejava.OOPS.Abstraction.Upcasting.dao.MotherDAO;
import com.qac.corejava.OOPS.Abstraction.Upcasting.dao.SonDAO;
import com.qac.corejava.OOPS.Abstraction.Upcasting.dto.SonDTO;

public class Tester {
	public static void main(String[] args) {
	FatherDAO fatherdao	= new SonDAO();
	fatherdao.isprofessor();
	fatherdao.isreading();
	
	MotherDAO motherdao = new SonDAO();
	motherdao.ishousewife();
	motherdao.isgoodcook();
	
	SonDTO sondto= new SonDTO();
	sondto.setName("Digvijay");
	sondto.setAge((byte)15);
	sondto.setHeight("5feeet");
	sondto.setWeight("30kg");
	
	System.out.println(sondto.getName());
	System.out.println(sondto.getAge());
	System.out.println(sondto.getHeight());
	System.out.println(sondto.getWeight());
	
	}
	}

