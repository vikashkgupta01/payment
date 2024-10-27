package com.payment.app.dto;

import lombok.Data;

@Data
public class TrnRequest {
	
	 private TrnInfo trnInfo;
     private DrAcct drAcct;
     private CrAcct crAcct;

}
