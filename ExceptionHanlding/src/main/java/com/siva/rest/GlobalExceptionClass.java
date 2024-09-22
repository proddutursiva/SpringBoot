package com.siva.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //To specify that a class as a Globel Exception 
public class GlobalExceptionClass {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity getErrorMsg(Exception e) {
		ExceptionInfo excinfo = new ExceptionInfo();
		excinfo.setMsg(e.getMessage());
		excinfo.setCode("001");
		return  new ResponseEntity<ExceptionInfo>(excinfo,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
