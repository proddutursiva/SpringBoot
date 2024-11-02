package com.siva.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siva.model.Person;
import com.siva.service.CustomerService;

@RestController
public class ControllerCls {

	@Autowired
	private CustomerService cservice;
	
	@PostMapping("/add")
	public String addperson(@RequestBody List<Person> list) {
		System.out.println("addperson started");
		cservice.add(list);
		System.out.println("addperson end");
		return "peson object added to kafka";
	}
}
