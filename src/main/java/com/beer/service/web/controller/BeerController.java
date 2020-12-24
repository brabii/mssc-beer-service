package com.beer.service.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beer.service.web.model.BeerDto;
import com.beer.service.web.model.PathApi;

@RequestMapping(PathApi.BEER_API)
@RestController
public class BeerController {

	@PutMapping("/{beerId}")
	public ResponseEntity<BeerDto> updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beer) {
		return new ResponseEntity<BeerDto>(HttpStatus.NO_CONTENT);
	}

	@PostMapping
	public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beer) {
		return new ResponseEntity<BeerDto>(HttpStatus.CREATED);
	}

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
		return new ResponseEntity<BeerDto>(BeerDto.builder().build(), HttpStatus.OK);
	}
}
