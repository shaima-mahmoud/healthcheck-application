package com.healthcheck.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CountryEntity {
	/**
	 * 
	 * CREATE TABLE country ( code character(3) NOT NULL, name text NOT NULL,
	 * continent text NOT NULL, region text NOT NULL, surface_area real NOT NULL,
	 * indep_year smallint, population integer NOT NULL, life_expectancy real, gnp
	 * numeric(10,2), gnp_old numeric(10,2), local_name text NOT NULL,
	 * government_form text NOT NULL, head_of_state text, capital integer, code2
	 * character(2) NOT NULL, CONSTRAINT country_continent_check CHECK
	 * ((((((((continent = 'Asia'::text) OR (continent = 'Europe'::text)) OR
	 * (continent = 'North America'::text)) OR (continent = 'Africa'::text)) OR
	 * (continent = 'Oceania'::text)) OR (continent = 'Antarctica'::text)) OR
	 * (continent = 'South America'::text))) );
	 */

	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	@Id
	private String code;

	private String name;

	private String continent;

	private String region;

	@Column(name = "surface_area")
	private Double surfaceArea;

	@Column(name = "indep_year")
	private Long indepYear;

	private Long population;

	@Column(name = "life_expectancy")
	private Double lifeExpectancy;

	private Double gnp;

	@Column(name = "gnp_old")
	private Double gnpOld;

	@Column(name = "local_name")
	private String localTime;

	@Column(name = "government_form")
	private String governmentForm;

	@Column(name = "head_of_state")
	private String headOfState;

	private Long capital;

	private String code2;

}
