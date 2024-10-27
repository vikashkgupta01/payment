package com.payment.app.dto;

import lombok.Data;

@Data
public class PaymentRequestDto{
	
	private Header header;
	private Body body;
	
}