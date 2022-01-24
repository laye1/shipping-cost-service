package com.saraya.shippingcostservice.controller;




import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class CalculCostController {
	
	
	RestTemplate restTemplate = new RestTemplate();
	
	String url = "http://localhost:5000/api/ship/shipId/{id}";
	
	
	
	
	
	
	

}
