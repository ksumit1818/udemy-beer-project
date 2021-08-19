package com.example.brewery.servicesImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.brewery.services.CustomerService;
import com.example.brewery.web.model.CustomerDto;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(String custId) {
		return CustomerDto
				.builder()
				.id(UUID.randomUUID())
				.CustomerName("Customer name")
				.build();
	}

}
