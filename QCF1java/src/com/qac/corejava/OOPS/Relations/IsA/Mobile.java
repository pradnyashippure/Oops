package com.qac.corejava.OOPS.Relations.IsA;

public class Mobile {
    private String brandName;
    private  String modelName;
    private int price;
    
    public Mobile () {
		System.out.println("Invoking  Mobile constructor");
		}
    
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}   
     
}
