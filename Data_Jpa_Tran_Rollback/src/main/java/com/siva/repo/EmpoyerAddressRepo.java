package com.siva.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.entity.EmployerAddres;

public interface EmpoyerAddressRepo extends JpaRepository<EmployerAddres, Serializable> {

}
