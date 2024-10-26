package com.payment.apps.dto;

import lombok.Data;

@Data
public class CrAcct {
	
	 private String custCin;
     private String cinSuffix;
     private String acctNo;
     private String acctName;
     private String acctType;
     private String acctFirstName;
     private String acctLastName;
     private String paymentType;
     private String billerShortName;
     private String billerLongName;

}
