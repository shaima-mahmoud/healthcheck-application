package com.healthcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcheck.exception.CountryException;
import com.healthcheck.model.Country;
import com.healthcheck.service.CountryService;

@RestController
@RequestMapping("/")
public class CountriesController {

	/**
	 * Implement an endpoint which when given country code should return country
	 * information Example GET- http:/localhost:8080/BHR should return: { "name":
	 * "Bahrain" "continent": "Asia" "population":617000 "life_expectancy":73
	 * "country_language":"Arabic" }
	 */

	private final static String COUNTRY_CODE = "/{countryCode}";
	
	@Autowired
    private CountryService countryService;
	
	@GetMapping(COUNTRY_CODE)
	public Country getCountry(@PathVariable String countryCode) throws CountryException {

			return countryService.getCountryByCode(countryCode);
		
	}
}
