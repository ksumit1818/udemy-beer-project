package com.example.brewery.web.mocel;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
	public BeerDto() {
	}
	public BeerDto(UUID id, String beerName, String beerStyle, Long upc) {
		super();
		this.id = id;
		this.beerName = beerName;
		this.beerStyle = beerStyle;
		this.upc = upc;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public String getBeerStyle() {
		return beerStyle;
	}
	public void setBeerStyle(String beerStyle) {
		this.beerStyle = beerStyle;
	}
	public Long getUpc() {
		return upc;
	}
	public void setUpc(Long upc) {
		this.upc = upc;
	}

}
