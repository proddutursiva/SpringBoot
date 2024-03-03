package com.siva.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	@Column(name="Book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bId;
	@Column(name="Book_name")
	private String bName;
	@Column(name="Book_cost")
	private Double bcost;
	@CreationTimestamp
	@Column(name="Date_Created",updatable=false)
	private LocalDateTime dateCreated;
	
	@UpdateTimestamp
	@Column(name="date_updated",insertable=false)
	private LocalDateTime updatedDate;
}
