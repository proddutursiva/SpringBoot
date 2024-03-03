package com.siva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.siva.service.ReportGenerateService;

@SpringBootApplication
public class AutowireExpApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AutowireExpApplication.class, args);
		ReportGenerateService bean = run.getBean(ReportGenerateService.class);
		bean.ReportGenerator();
		
	}

}
