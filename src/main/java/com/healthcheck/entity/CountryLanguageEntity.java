package com.healthcheck.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "country_language")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CountryLanguageEntity {

	
	@Id
	@Column(name="country_code")
	private String countryCode;
	
	private String language;
	
	@Column(name="is_official")
	private boolean official;
			
	private Double percentage;

	public Object getLanguage() {
		return language;
	}
			
}
