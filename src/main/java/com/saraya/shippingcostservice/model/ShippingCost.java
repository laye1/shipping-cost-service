package com.saraya.shippingcostservice.model;

public class ShippingCost {
	
	private String serviceType;
	private int moveSize;
	private String countryLand;
	private String countryFrom;
	
	
	
	
	public ShippingCost(String serviceType, int moveSize, String countryLand, String countryFrom) {
		super();
		this.serviceType = serviceType;
		this.moveSize = moveSize;
		this.countryLand = countryLand;
		this.countryFrom = countryFrom;
	}



	public String getServiceType() {
		return serviceType;
	}



	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}



	public int getMoveSize() {
		return moveSize;
	}



	public void setMoveSize(int moveSize) {
		this.moveSize = moveSize;
	}



	public String getCountryLand() {
		return countryLand;
	}



	public void setCountryLand(String countryLand) {
		this.countryLand = countryLand;
	}



	public String getCountryFrom() {
		return countryFrom;
	}



	public void setCountryFrom(String countryFrom) {
		this.countryFrom = countryFrom;
	}
	
	
	
	

}
