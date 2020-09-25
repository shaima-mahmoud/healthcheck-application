package com.healthcheck.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcheck.entity.CountryEntity;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, String> {

	Optional<CountryEntity> findByCode(String code);
	

}
