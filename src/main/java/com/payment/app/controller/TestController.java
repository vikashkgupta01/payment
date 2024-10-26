package com.payment.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	
	@GetMapping("/data")
	public String getData() {
		return "Application running succcesssfully!!!!";
	}
}
