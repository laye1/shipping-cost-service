package com.saraya.shippingcostservice.dto;

import java.util.Date;

public class ShippingDTO {
	
	private Long id;
	private String countryFrom;
	private String countryTo;
	private String cityTo;
	private String zip;
	private String serviceType;
	private int moveSize;
	private Date moveDate;
	public ShippingDTO(String countryFrom, String countryTo, String cityTo, String zip, String serviceType,
			int moveSize, Date moveDate) {
		super();
		this.countryFrom = countryFrom;
		this.countryTo = countryTo;
		this.cityTo = cityTo;
		this.zip = zip;
		this.serviceType = serviceType;
		this.moveSize = moveSize;
		this.moveDate = moveDate;
	}
	public ShippingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountryFrom() {
		return countryFrom;
	}
	public void setCountryFrom(String countryFrom) {
		this.countryFrom = countryFrom;
	}
	public String getCountryTo() {
		return countryTo;
	}
	public void setCountryTo(String countryTo) {
		this.countryTo = countryTo;
	}
	public String getCityTo() {
		return cityTo;
	}
	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
	public Date getMoveDate() {
		return moveDate;
	}
	public void setMoveDate(Date moveDate) {
		this.moveDate = moveDate;
	}
	@Override
	public String toString() {
		return "ShippingDTO [id=" + id + ", countryFrom=" + countryFrom + ", countryTo=" + countryTo + ", cityTo="
				+ cityTo + ", zip=" + zip + ", serviceType=" + serviceType + ", moveSize=" + moveSize + ", moveDate="
				+ moveDate + "]";
	}
	

}
