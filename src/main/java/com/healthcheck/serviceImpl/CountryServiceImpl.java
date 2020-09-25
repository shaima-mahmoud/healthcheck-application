package com.healthcheck.serviceImpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.enums.ErrorCode;
import com.healthcheck.entity.CountryEntity;
import com.healthcheck.entity.CountryLanguageEntity;
import com.healthcheck.exception.CountryException;
import com.healthcheck.model.Country;
import com.healthcheck.repository.CountryLanguageRepository;
import com.healthcheck.repository.CountryRepository;
import com.healthcheck.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private CountryLanguageRepository countryLanguageRepository;

	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Country getCountryByCode(String code) throws CountryException {
		Optional<CountryEntity> result = countryRepository.findByCode(code);
		
		if (!result.isPresent())
			throw new CountryException(ErrorCode.INVALID_COUNTRY_CODE);
		
		Optional<CountryLanguageEntity> lang = countryLanguageRepository.findByCountryCode(code);
		Country cont = modelMapper.map(result.get(), Country.class);
		
		if(lang.isPresent())
			cont.setCountry_language((String)lang.get().getLanguage());
		return cont;
		
	}
}
