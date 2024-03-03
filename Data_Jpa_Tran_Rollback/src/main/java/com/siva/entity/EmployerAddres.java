package com.siva.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp_address_TBL")
public class EmployerAddres {
	@Id
	private Integer empAddrId;
	private Integer empId;
	private String empState;
	private String empCity;
	private String empCountry;
	@CreationTimestamp()
	@Column(name = "date_created",updatable=false)
	private LocalDateTime date_created;
	@UpdateTimestamp()
	@Column(name = "date_updated",insertable=false)
	private LocalDateTime date_updated;
	public Integer getEmpAddrId() {
		return empAddrId;
	}
	public void setEmpAddrId(Integer empAddrId) {
		this.empAddrId = empAddrId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpCountry() {
		return empCountry;
	}
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	public EmployerAddres() {
		System.out.println("Employer 0 constructor parameter");
	}
	public EmployerAddres(Integer empAddrId, Integer empId, String empState, String empCity, String empCountry) {
		
		super();
		this.empAddrId = empAddrId;
		this.empId = empId;
		this.empState = empState;
		this.empCity = empCity;
		this.empCountry = empCountry;
		System.out.println("Employer  constructor  with parameter");
	}

}
