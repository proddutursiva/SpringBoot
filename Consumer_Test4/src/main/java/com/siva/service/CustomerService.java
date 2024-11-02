package com.siva.service;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.siva.model.Person;

@Service
public class CustomerService {
	
	@KafkaListener(topics="Person_topic",groupId="test")
	public String Lisetner(List<Person> p) {
		System.out.println("listener:::start");
		System.out.println("listener:::end");
		System.out.println("Person :::::::::::::"+p);
		return "pring message from kafa consumer";
	}

}
