package com.healthcare.enums;

public enum ErrorCode {
	
	INVALID_COUNTRY_CODE("1", "INVALID_COUNTRY_CODE"), 
	INTERNAL_SERVER_ERROR("2","INTERNAL_SERVER_ERROR");
	
	ErrorCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public final String code;
	public final String message;
}

