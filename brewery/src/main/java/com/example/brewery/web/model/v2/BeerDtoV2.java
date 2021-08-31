package com.example.brewery.web.model.v2;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BeerDtoV2 {

	private UUID id;
	private String beerName;
	private BeerStyleEnum beerStyle;
	private Long upc;
}
