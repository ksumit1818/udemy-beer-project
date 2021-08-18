package com.example.brewery.web.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.brewery.web.mocel.BeerDto;

@RequestMapping("/api/v1")
@RestController
public class BeerController {
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){
		return new ResponseEntity<>(BeerDto.);
	}

}
