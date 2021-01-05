package com.beer.service.web.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.beer.service.web.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
