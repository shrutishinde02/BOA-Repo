package com.boa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boa.model.Customer;
import com.boa.service.CustomerService;

@RestController  
@RequestMapping("/api") 
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customers")  
	public void createUser(@RequestBody Customer Customer)  
	{  
		customerService.createCustomer(Customer);
	}  
	
}
