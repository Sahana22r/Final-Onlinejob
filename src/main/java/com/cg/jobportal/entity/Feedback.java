package com.cg.jobportal.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback  {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Integer ranges;
	String comments;

	 @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name="fk_id_of_recruiter")
     private Recruiter recruiter;

	
}
