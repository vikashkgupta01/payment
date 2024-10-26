package com.payment.app.common.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class FlowContext {
	
	Map<String, Object> flowParams=new HashMap<>();
	
	public FlowContext() {
		
	}

}
