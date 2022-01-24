package com.saraya.shippingcostservice.service;


import java.util.List;

import org.springframework.stereotype.Service;


@Service
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
	  
    List<String> serviceList = List.of("full packing and loading","partial packing and loading","loading");
    
	  
	  if(serviceList.contains(serviceType) && serviceType.equalsIgnoreCase("full packing and loading")) {
		  
		  costService = moveSize*150;
		  
	  }else if(serviceList.contains(serviceType) && serviceType.equalsIgnoreCase("partial packing and loading")) {
		  
		  costService = moveSize*100;
	  }else if(serviceList.contains(serviceType) && serviceType.equalsIgnoreCase("loading")) {
		 
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
