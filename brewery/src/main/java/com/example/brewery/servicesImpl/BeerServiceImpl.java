package com.example.brewery.servicesImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.brewery.services.BeerService;
import com.example.brewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {

		return BeerDto.builder()
				.id(UUID.randomUUID())
				.beerName("name")
				.beerStyle("style")
				.build();
	}

}
