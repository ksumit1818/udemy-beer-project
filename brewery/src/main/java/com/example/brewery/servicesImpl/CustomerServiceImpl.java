package com.example.brewery.servicesImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.brewery.services.CustomerService;
import com.example.brewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID custId) {
		return CustomerDto
				.builder()
				.id(UUID.randomUUID())
				.custName("Customer name")
				.build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateCustomer(CustomerDto customerDto) {
		
	}

	@Override
	public void deleteCustomerById(UUID custId) {
		log.debug("Deleting customer ...");
	}


}
