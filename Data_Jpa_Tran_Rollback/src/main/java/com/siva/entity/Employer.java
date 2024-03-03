package com.siva.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMP_TBL")
public class Employer {
	
	@Id
	@Column(name="Emp_id")
	private Integer empid;
	@Column(name = "Emp_name")
	private String empName;
	@Column(name = "Emp_sal")
	private Double empSal;
	@CreationTimestamp()
	@Column(name = "date_created",updatable=false)
	private LocalDateTime date_created;
	@UpdateTimestamp()
	@Column(name = "date_updated",insertable=false)
	private LocalDateTime date_updated;
	
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public Employer() {
		System.out.println("Employer 0 constructor parameter");
	}
	public Employer(Integer empid, String empName, Double empSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
		System.out.println("Employer constructor  with parameter");
	}
	

}
