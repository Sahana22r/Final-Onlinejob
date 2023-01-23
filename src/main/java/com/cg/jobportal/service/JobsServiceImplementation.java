package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.jobportal.entity.Job;
import com.cg.jobportal.repository.FreelancerRepository;
import com.cg.jobportal.repository.JobRepository;
import com.cg.jobportal.repository.RecruiterRepository;
import com.cg.jobportal.repository.SkillRepository;

@Service
public class JobsServiceImplementation implements JobsService {
	
	
	@Autowired
	JobRepository jar;
	
	
	@Autowired
	SkillRepository sr;
	
	@Autowired
	RecruiterRepository recruiterrepo;
	
	@Autowired
	FreelancerRepository freelancerrepo;
	
	@Override
	public Job addjob(Job jobs) {
		return jar.save(jobs);
	}
	
	
	@Override
	public List<Job> findAll() {
		return jar.findAll();
	}
	
	@Override
	public Optional<Job> findById(long id) {
		return jar.findById(id);
	}


    @Override
	public String deletejob(long id) {
		if (jar.existsById(id)) {
             jar.deleteById(id);
		}
		return "Doesn't Exists";
		
    }



}




