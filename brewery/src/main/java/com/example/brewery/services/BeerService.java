package com.example.brewery.services;

import java.util.UUID;

import com.example.brewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

}
