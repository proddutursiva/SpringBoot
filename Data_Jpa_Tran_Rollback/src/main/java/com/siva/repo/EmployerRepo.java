package com.siva.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.entity.Employer;

public interface EmployerRepo extends JpaRepository<Employer, Serializable> {

}
