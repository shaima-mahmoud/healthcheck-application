package com.healthcheck.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcheck.entity.CountryLanguageEntity;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguageEntity, Long> {

	Optional<CountryLanguageEntity> findByCountryCode(String code);
	
}
