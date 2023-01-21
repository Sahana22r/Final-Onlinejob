package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.jobportal.entity.Recruiter;
import com.cg.jobportal.repository.RecruiterRepository;

@Service
public class RecruiterServiceImpl implements RecruiterService{
	
	@Autowired
	private RecruiterRepository recRepo;

	@Override
	public Recruiter saveRecruiter(Recruiter rec) {
	return recRepo.save(rec);
	}

	@Override
	public List<Recruiter> getAllRecruiters() {
		return recRepo.findAll();
	}
	
	@Override
	public Optional<Recruiter> getRecruiterById(Long id) {
		return recRepo.findById(id);
	}
	
	@Override
	public String deleteById(Long id) {
		recRepo.deleteById(id);
		return "Recruiter deleted successfully";
	}
	
	@Override
	public Recruiter updateRecruiter(Recruiter rec) {
		 return recRepo.save(rec);
	}
}
