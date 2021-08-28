package com.example.brewery.servicesImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.brewery.services.BeerService;
import com.example.brewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		
	}

	@Override
	public void deleteById(UUID beerId) {	
		log.debug("Deleting a beer ...");
	}
	
	

}
