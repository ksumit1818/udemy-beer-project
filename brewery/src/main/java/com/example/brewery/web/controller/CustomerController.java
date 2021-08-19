package com.example.brewery.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.brewery.services.CustomerService;
import com.example.brewery.web.model.CustomerDto;

@RequestMapping("/api/v1/cust")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public CustomerController(CustomerService beerService) {
		this.customerService = beerService;
	}
	
	@GetMapping("/{custId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable String custId){
		return new ResponseEntity<>(customerService.getCustomerById(custId),HttpStatus.OK);
	}
}
