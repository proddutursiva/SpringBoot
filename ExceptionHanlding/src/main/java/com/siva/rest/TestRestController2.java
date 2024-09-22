package com.siva.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController2 {
	private Logger log = LoggerFactory.getLogger(TestRestController2.class);
	
	@GetMapping("/getwelcomeMsg1")
	public String getWelcome() {
		String msg = "";
		try {
		 msg = "Welocme msg";
		int i =10/0;
		}catch(Exception e) {
			log.error("Exception occur::::"+e.getMessage());
			throw new UserDefinedExc("user defined Exception");
		}
		
		return msg;
	}

	
}
