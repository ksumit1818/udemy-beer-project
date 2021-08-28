package com.example.brewery.services;

import java.util.UUID;

import com.example.brewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID custId);

	CustomerDto saveNewCustomer(CustomerDto customerDto);

	void updateCustomer(CustomerDto customerDto);

	void deleteCustomerById(UUID custId);

	
}
