package com.saraya.shippingcostservice;

public class Costs {
	
 private int	serviceTypeCost;
 private int	rangeCost;
 private int	totalCost;
 
 
public Costs(int serviceTypeCost, int rangeCost, int totalCost) {
	super();
	this.serviceTypeCost = serviceTypeCost;
	this.rangeCost = rangeCost;
	this.totalCost = totalCost;
}


public Costs() {
	super();
	// TODO Auto-generated constructor stub
}


public int getServiceTypeCost() {
	return serviceTypeCost;
}


public void setServiceTypeCost(int serviceTypeCost) {
	this.serviceTypeCost = serviceTypeCost;
}


public int getRangeCost() {
	return rangeCost;
}


public void setRangeCost(int rangeCost) {
	this.rangeCost = rangeCost;
}


public int getTotalCost() {
	return totalCost;
}


public void setTotalCost(int totalCost) {
	this.totalCost = totalCost;
}


 
 

}
