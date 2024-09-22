package com.siva.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestCntrl {
	
	@GetMapping("/getWelcome")
	public String getWelcomeMsg() {
		String msg = "Welcome Msg";
		return msg;
	}

}
