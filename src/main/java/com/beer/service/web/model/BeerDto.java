package com.beer.service.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
	private BeerStyleEnum beerStyle;
	private String upc;
	private Integer quantityOnHand;
	private BigDecimal price;
	private Integer version;
	private OffsetDateTime createdDate;
	private OffsetDateTime lastModifiedDate;
}
