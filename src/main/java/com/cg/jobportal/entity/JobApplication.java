package com.cg.jobportal.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false,length=50)
	private long id;
	private LocalDateTime appliedDate = LocalDateTime.now();
	@Column(nullable=false,length=50)
	private String coverLetter;
	
	@ManyToOne(targetEntity = Jobs.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_jobs_id")
	private Jobs job;


	
}
