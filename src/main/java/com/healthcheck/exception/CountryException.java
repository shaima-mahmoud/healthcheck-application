package com.healthcheck.exception;

import com.healthcare.enums.ErrorCode;

public class CountryException extends Exception{
	
	public final ErrorCode errorCode;
	
	public CountryException(ErrorCode error) {
		super(error.message);
		this.errorCode = error;
	}
}
