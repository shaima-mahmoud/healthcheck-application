package com.healthcheck.service;

import com.healthcheck.exception.CountryException;
import com.healthcheck.model.Country;

public interface CountryService {

	Country getCountryByCode(String code) throws CountryException;
}
