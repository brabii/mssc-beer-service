package com.beer.service.web.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.beer.service.web.domain.Beer;
import com.beer.service.web.repository.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner {

	private final BeerRepository beerRepo;

	public BeerLoader(BeerRepository beerRepo) {
		this.beerRepo = beerRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		loadBeerObjects();
	}

	private void loadBeerObjects() {
		if (beerRepo.count() == 0) {
			beerRepo.save(Beer.builder()
					.beerName("Mango bobs")
					.beerStyle("API")
					.quantityToBrew(200)
					.minOnHand(20)
					.upc(20641545L)
					.price(new BigDecimal("12.59"))
					.build());
			beerRepo.save(Beer.builder()
					.beerName("Galaxy cat")
					.beerStyle("XXX")
					.quantityToBrew(200)
					.minOnHand(21)
					.upc(206415545L)
					.price(new BigDecimal("09.59"))
					.build());
		}
		System.out.println(beerRepo.count());
	}
	
}
