package com.siva.service;

import org.springframework.stereotype.Service;

import com.siva.entity.Employer;
import com.siva.entity.EmployerAddres;
import com.siva.repo.EmployerRepo;
import com.siva.repo.EmpoyerAddressRepo;

import jakarta.transaction.Transactional;
@Service
public class EmpoyerService {
	
	@Transactional(rollbackOn={Exception.class})
	public void saveEmpdata(EmployerRepo employerRepo,EmpoyerAddressRepo employerAddresRepo,Employer employer,EmployerAddres employerAddres) {
		try {
			employer.setEmpid(4);
			employer.setEmpName("");
			employerRepo.save(employer);
			int i = 10/0;
			employerAddres.setEmpId(2);
			employerAddres.setEmpAddrId(101);
			employerAddresRepo.save(employerAddres);
		} catch (Exception e) {
			throw e;
			//e.printStackTrace();
		}
		
	}

}
