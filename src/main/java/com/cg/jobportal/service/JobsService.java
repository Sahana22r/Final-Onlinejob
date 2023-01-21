package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Jobs;

public interface JobsService {

	
	Jobs addjob(Jobs jobs);
	
	List<Jobs> findAll();
	
	Optional<Jobs> findById(long id);
	
	String deletejob(long id);
	
	
}
