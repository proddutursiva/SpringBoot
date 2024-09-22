package com.siva.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.siva.service.WelcomeService_1;

public class RestController_1 {
	
	@Autowired
	private WelcomeService_1 welcomeser;

	@GetMapping("/welcome")
	public String getwelcomeMsg() {
		String welcomeMsg = welcomeser.getWelcomeMsg();
		return welcomeMsg;
	}
}
