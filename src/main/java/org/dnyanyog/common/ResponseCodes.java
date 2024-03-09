package org.dnyanyog.common;


public enum ResponseCodes {
	
	
	 ADD_CUSTOMER_SUCCESS("Success","Customer added Successfully","0"),
	
	 ADD_CUSTOMER_DUPLICATE_EMAIL("Fail","Email is already exist! Please enter valid emailID","0000"),
	
	 CUSTOMER_NOT_FOUND("Fail","Customer not present","0000"),
	
	 CUSTOMER_DETAILS_FOUND("Success","Customer details are as follows:","0000");

	private final String code;
	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}

	private final String message;
	private final String status;

	ResponseCodes(String code, String message,String status) {
		this.code = code;
		this.message = message;
		this.status =status;
	}

	

}