package com.siva.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	private Logger log = LoggerFactory.getLogger(TestRestController.class);
	
	@GetMapping("/getwelcomeMsg")
	public String getWelcome() {
		String msg = "";
		try {
		 msg = "Welocme msg";
		int i =10/0;
		}catch(Exception e) {
			log.error("Exception occur::::"+e.getMessage());
			throw new ArithmeticException(e.getMessage());
		}
		
		return msg;
	}

}
