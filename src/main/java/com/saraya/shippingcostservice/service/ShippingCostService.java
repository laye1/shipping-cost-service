package com.saraya.shippingcostservice.service;


import java.util.List;

import org.springframework.stereotype.Service;



public class ShippingCostService {
	
private int costRange = 0;
private int costService = 0;

	
  public int rangeCost(String countryLand,String countryFrom) {
		
	     List<String> landZone1 = List.of("France","Italie","Belgique");
	    
	     
	     List<String> fromZone1 = List.of("Senegal","Gambie","Mali");
	     
	     if(landZone1.contains(countryLand) && fromZone1.contains(countryFrom)){
	    	 
	    	 costRange = 200;
	    	 
	     }
		
		return costRange;
	}
  
  
  public int serviceTypeCost(String serviceType,int moveSize) {
	  
	String serviceList = "full packing and loading";
	String serviceList1 = "partial packing and loading";
	String serviceList2 = "loading";
	  
  
	  
	  if(serviceList.equalsIgnoreCase(serviceList)) {
		  
		  costService = moveSize*150;
		  
	  }else if(serviceList1.equalsIgnoreCase(serviceList1)) {
		  
		  costService = moveSize*100;
	  }else if(serviceList2.equalsIgnoreCase(serviceList2)) {
		 
		  costService = moveSize*65;
		  
	  }
	  
	  
	  return costService;
	   }
  
      
  public int totalCost(String countryLand,String countryFrom,
		  String serviceType,int moveSize) {
	  
	  int total = rangeCost(countryLand, countryFrom) + serviceTypeCost( serviceType, moveSize);
	  
	  return total;
	  
  }
  

}
