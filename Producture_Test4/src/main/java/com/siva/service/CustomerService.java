package com.siva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.siva.model.Person;

@Service
public class CustomerService {

	@Autowired
	private KafkaTemplate<String,Person> kt;
	
	public void add(List<Person> list) {
		System.out.println("Add method started");
		if(list!=null) {
			for(Person p:list) {
				kt.send("Person_topic", p);
			}
		}
		System.out.println("Add method end");
	}
}
