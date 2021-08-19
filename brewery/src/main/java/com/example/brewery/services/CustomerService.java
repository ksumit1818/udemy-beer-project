package com.example.brewery.services;

import com.example.brewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(String custId);

}
