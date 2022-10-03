package com.qac.corejava.OOPS.Relations;

import com.qac.corejava.OOPS.Relations.IsA.Redmi;

public class TestMobile {
	public static void main(String [] args) {
		Redmi r = new Redmi();
	    r.setBrandName("Redmi");
	    r.setModelName("note 9 pro");
	    r.setPrice(17999);
	    r.setRam((byte)6);
	    r.setColor("Black");
	    
	    System.out.println(r.getBrandName());
	    System.out.println(r.getModelName());
	    System.out.println(r.getPrice());
	    System.out.println(r.getRam());
	    System.out.println(r.getColor());
			
	}

}
