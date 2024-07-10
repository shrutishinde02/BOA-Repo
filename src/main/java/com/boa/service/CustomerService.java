package com.boa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boa.model.Customer;

@Service
public class CustomerService {
	private List<Customer> customers = new ArrayList<>();
	
	 
	public void createCustomer(Customer customer) {
	customers.add(customer);
	}
}
