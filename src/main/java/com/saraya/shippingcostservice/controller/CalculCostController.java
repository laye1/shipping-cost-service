package com.saraya.shippingcostservice.controller;



 



import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.saraya.shippingcostservice.dto.ShippingDTO;
import com.saraya.shippingcostservice.service.ShippingCostService;



@RestController
@CrossOrigin("*")
public class CalculCostController {
	
	private String countryFrom="";
	private String countryTo="";
	private int moveSize=0;
	private String serviceType="";
	
	
	RestTemplate restTemplate = new RestTemplate();

	
	private ShippingCostService shippingCostService =new ShippingCostService() ;
     
		/**
	     @GetMapping
	    public List<ShippingDTO> showCost() {
		
		
		//String url="http://localhost:5000/api/ship";
		List shippings =  restTemplate.getForObject("http://localhost:5000/api/ship/lastShip" , List.class);
		//List<ShippingDTO> shipping =  restTemplate.getForObject("http://localhost:5000/api/ship" , List.class);
		
		 
		 return shippings;
          
	
	   //String url2 = "http://localhost:5000/api/ship/shipId/{id}";
	
	}
*/
	
	  @GetMapping
	   public List<Integer> getTotalCost() {
		   
	    	 
		  ShippingDTO shippings =  restTemplate.getForObject("http://localhost:5000/api/register/lastShip" , ShippingDTO.class);
		 
		  
			  serviceType = shippings.getServiceType();
			  countryFrom = shippings.getCountryFrom();
			  countryTo = shippings.getCountryTo();
			  moveSize = shippings.getMoveSize();
			  
		
		  
		 
		  
		  
		   int rangeCost = shippingCostService.rangeCost(countryTo, countryFrom);
		   
		   int serviceTypeCost = shippingCostService.serviceTypeCost(serviceType, moveSize);
		  
		   int totalCost = shippingCostService.totalCost(countryTo,countryFrom,serviceType,moveSize);
		   List<Integer> prices = List.of(serviceTypeCost,rangeCost,totalCost);
		   
		   return prices;
		

		
		 
		   
	     }
	
		 
	}
	   
	


