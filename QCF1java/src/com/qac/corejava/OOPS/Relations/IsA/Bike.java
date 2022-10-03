package com.qac.corejava.OOPS.Relations.IsA;

public class Bike {
private String brandname;
private String color;
private int cost ;
private String modelname;


public Bike() {
	System.out.println("Invoking bike costructor");
}
public String getBrandname() {
	return brandname;
}
public void setBrandname(String brandname) {
this.brandname = brandname;
}
public String getModelname() {
	return modelname;
}
public void setModelname(String modelname) {
this.modelname = modelname;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
this.color = color;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
this.cost = cost;
}
}
