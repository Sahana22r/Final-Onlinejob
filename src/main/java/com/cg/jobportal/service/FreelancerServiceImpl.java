package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Freelancer;
import com.cg.jobportal.repository.FreelancerRepository;

@Service
public class FreelancerServiceImpl implements FreelancerService {
    
	@Autowired
	FreelancerRepository frepo;

	@Override
	public Freelancer saveFreelancer(Freelancer free) {
		return frepo.save(free);
	}

	@Override
	public List<Freelancer> getAllFreelancer() {
		return frepo.findAll();
	}

	@Override
	public Optional<Freelancer> getFreelancerById(long id) {
		return frepo.findById(id);
	}

	@Override
	public String deleteFreelancer(long id) {
		Optional<Freelancer> getId = frepo.findById(id);
		if(getId.isPresent()) {
			frepo.deleteById(id);
		}
		return "Freelancer Doesn't Exists";
	}

	@Override
	public Freelancer updateFreelancer(Freelancer free) {
		return frepo.save(free);
	}

	@Override
	public List<Freelancer> FreelancerByUserName(String userName) {
		return frepo.findByUserName(userName);
	}
	
	
}
