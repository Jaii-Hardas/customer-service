package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
public class CustomerResponse {

	@NotNull(message = "Status cannot be null")
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@NotNull(message = "Message cannot be null")
	@Size(min = 1, max = 255, message = "Message must be between 1 and 255 characters")
	private String message;
	
	@NotNull(message = "Customer code cannot be null")
	private long customerCode;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(long customerCode) {
		this.customerCode = customerCode;
	}

	
}