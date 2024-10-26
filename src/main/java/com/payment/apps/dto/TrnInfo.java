package com.payment.apps.dto;

import lombok.Data;

@Data
public class TrnInfo {
	
	private String settlementDate;
    private String paymentDate;
    private String serviceType;
    private String txnAmt;
    private String txnAmtCurrency;
    private String interfaceRefNum;
    private String crn;
    private String billEnquiryRef;

}
