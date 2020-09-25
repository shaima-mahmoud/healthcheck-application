package com.healthcheck.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
	/**
	 * Implement an endpoint which when given country code should return country
	 * information Example GET- http:/localhost:8080/BHR should return: 
	 * { "name": "Bahrain" 
	 * "continent": "Asia" 
	 * "population":617000
	 *  "life_expectancy":73
	 *  "country_language":"Arabic" }
	 */
	
	
	private String name;
	
	private String continent;
	
	private Long population;
	
	private Double life_expectancy;
	
	private String country_language;

	public void setCountry_language(String language) {
		this.country_language = language;
	}

}
