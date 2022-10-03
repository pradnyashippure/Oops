package com.qac.corejava.OOPS.Relations.HasA;

public class TestBike {
	public static void main(String [] args) {
		Engine engine = new Engine();
		engine.setBrandName("BMW");
		engine.setCapacity((short)312);
		engine.setNoofstrokes((byte) 4);
		
		
		Bike bike = new Bike();
		bike.setBrandName("BMW");
		bike.setModelName("rr310");
		bike.setCost(3000000);
		bike.setEngine(engine);
		
		System.out.println(bike.getBrandName());
		System.out.println(bike.getModelName());
		System.out.println(bike.getCost());
	    System.out.println(bike.getEngine());
	    
	    Engine bmwEng = bike.getEngine();
	    System.out.println(bmwEng.getBrandName());
	    System.out.println(bmwEng.getCapacity());
	    System.out.println(bmwEng.getNoofstrokes());
	    
	}

}
