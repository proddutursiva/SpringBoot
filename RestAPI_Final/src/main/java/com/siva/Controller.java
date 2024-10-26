package com.siva;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Controller {
	
	@GetMapping("/get")
	public ResponseEntity<String> getService(
			HttpServletRequest request,
			@RequestHeader Map<String,String> headers,
			@RequestParam Map<String,String> reqparams
			){
		ApiUtils.getHttpServeletRequest(request);
		ApiUtils.getReqHeaders(headers);
		
		return new ResponseEntity<>("getService:::",HttpStatus.OK);
	}
	@GetMapping("/get/queryparam")//in url after ? queryparam else error
	public ResponseEntity<String> getServiceQuearyParam(
			HttpServletRequest request,
			@RequestHeader Map<String,String> headers,
			@RequestParam String reqparams
			){
		ApiUtils.getHttpServeletRequest(request);
		ApiUtils.getReqHeaders(headers);
		String val = "/get/queryparam:::::::::::"+reqparams;
		return new ResponseEntity<>(val,HttpStatus.OK);
	}
	@GetMapping("/get/{pathvariable}/{pathvariable1}")
	public ResponseEntity<String> getServicePathVariable(
			HttpServletRequest request,
			@RequestHeader Map<String,String> headers,
			@PathVariable String pathvariable,@PathVariable String pathvariable1
			){
		ApiUtils.getHttpServeletRequest(request);
		ApiUtils.getReqHeaders(headers);
		
		String val = "/get/{pathvar}/{22222}:::::::"+pathvariable+":::::"+pathvariable1;
		return new ResponseEntity<>(val,HttpStatus.OK);
	}

	@PostMapping("/post")
	public ResponseEntity<String> postMethod(@RequestBody String req){
		boolean validateJSON = ApiUtils.validateJSON(req);
		String processRequest = "";
		if(validateJSON) {
			CompleteRequests allreq = new CompleteRequests();
			allreq.setReqCode("post");
			allreq.setRequest(req);
			ApiUtils.jsonTOBean(allreq);
			processRequest = ApiHelper.processRequest(allreq);
		}

		return new ResponseEntity<>(processRequest,HttpStatus.OK);
	}
	
}
