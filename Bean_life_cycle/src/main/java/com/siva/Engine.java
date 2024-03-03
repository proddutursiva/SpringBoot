package com.siva;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine::::: construtor");
	}

	@PostConstruct
	public void init() {
		System.out.println("Engine::::: start");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Engine::::: end");
	}
}
