package com.healthcheck.advisor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.healthcare.enums.ErrorCode;
import com.healthcheck.exception.CountryException;

@ControllerAdvice
public class CountryControllerAdvisor extends ResponseEntityExceptionHandler {

	
	 private static final Map<ErrorCode, HttpStatus> errorCodeToStatus;

	static {
		Map<ErrorCode, HttpStatus> aMap = new HashMap<>();
		aMap.put(ErrorCode.INVALID_COUNTRY_CODE, HttpStatus.NOT_FOUND);
		errorCodeToStatus = Collections.unmodifiableMap(aMap);
	}

	@ExceptionHandler(CountryException.class)
	public ResponseEntity<?> handleCountryNotFoundException(CountryException ex, WebRequest request) {
		if(errorCodeToStatus.containsKey(ex.errorCode))
			return new ResponseEntity<>(ex.errorCode.message, errorCodeToStatus.get(ex.errorCode));
		else 
			return new ResponseEntity<>(ErrorCode.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
