package com.example.brewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.brewery.services.CustomerService;
import com.example.brewery.web.model.CustomerDto;

@RequestMapping("/api/v1/cust")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/{custId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID custId){
		return new ResponseEntity<>(customerService.getCustomerById(custId),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto> handlePost(@RequestBody CustomerDto customerDto){
		CustomerDto saveCust=customerService.saveNewCustomer(customerDto);
		HttpHeaders headers=new HttpHeaders();
		headers.add("Location","/api/v1/cust/"+saveCust.getId().toString());
		return new ResponseEntity<>(headers,HttpStatus.CREATED); 
	}
	
	@PutMapping("/{custId}")
	public ResponseEntity handleUpdate(@PathVariable UUID custId,@RequestBody CustomerDto customerDto) {
		customerService.updateCustomer(customerDto);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{custId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void handleDeleteById(@PathVariable UUID custId) {
		customerService.deleteCustomerById(custId);
	}
}
