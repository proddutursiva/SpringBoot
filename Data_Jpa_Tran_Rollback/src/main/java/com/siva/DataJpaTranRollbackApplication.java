package com.siva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.siva.entity.Employer;
import com.siva.entity.EmployerAddres;
import com.siva.repo.EmployerRepo;
import com.siva.repo.EmpoyerAddressRepo;
import com.siva.service.EmpoyerService;

@SpringBootApplication
public class DataJpaTranRollbackApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DataJpaTranRollbackApplication.class, args);
		EmployerRepo employerRepo = configurableApplicationContext.getBean(EmployerRepo.class);
		EmpoyerAddressRepo employerAddresRepo = configurableApplicationContext.getBean(EmpoyerAddressRepo.class);
		Employer employer = new Employer();
		EmployerAddres employerAddres = new EmployerAddres();
		EmpoyerService empservice = new EmpoyerService();
		empservice.saveEmpdata(employerRepo,employerAddresRepo,employer,employerAddres);
		
	}

}
