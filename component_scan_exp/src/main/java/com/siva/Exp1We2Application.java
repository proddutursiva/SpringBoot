package com.siva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.siva","com.other.pacakge"})
public class Exp1We2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exp1We2Application.class, args);
	}

}
