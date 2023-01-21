package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.jobportal.entity.Jobs;
import com.cg.jobportal.repository.FreelancerRepository;
import com.cg.jobportal.repository.JobsRepository;
import com.cg.jobportal.repository.RecruiterRepository;
import com.cg.jobportal.repository.SkillRepository;

@Service
public class JobsServiceImplementation implements JobsService {
	
	
	@Autowired
	JobsRepository jar;
	
	
	@Autowired
	SkillRepository sr;
	
	@Autowired
	RecruiterRepository recruiterrepo;
	
	@Autowired
	FreelancerRepository freelancerrepo;
	
	@Override
	public Jobs addjob(Jobs jobs) {
		Jobs pj = jar.save(jobs);
		return pj;
	}
	
/*	@Override
	public Jobs addjob(Jobs jobs) {
		Jobs job = new Jobs();
			
			job.setSkill(sr.findById(jobs.getSkill()).get());
			job.setActive(true);
			job.setJobTitle(jobs.getJobTitle());
			job.setJobDescription(jobs.getJobDescription());
			return jar.save(job);
		
	}*/
	
	@Override
	public List<Jobs> findAll() {
		return jar.findAll();
	}
	
	@Override
	public Optional<Jobs> findById(long id) {
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




