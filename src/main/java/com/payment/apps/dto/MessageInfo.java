package com.payment.apps.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MessageInfo {
	 private String messageId;
     private String messageType;
     private String messageDateTime;
}
