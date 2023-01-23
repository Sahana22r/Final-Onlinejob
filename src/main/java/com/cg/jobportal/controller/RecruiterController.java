package com.cg.jobportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Recruiter;
import com.cg.jobportal.exceptions.InvalidRecruiterException;
import com.cg.jobportal.exceptions.RecruiterAlreadyExistException;
import com.cg.jobportal.service.RecruiterService;


@RequestMapping("/Recruiter")
@RestController
public class RecruiterController {
	
	@Autowired
	public RecruiterService recruiterService;

	@PostMapping("/save")
	public ResponseEntity<Recruiter> saveRecruiter(@RequestBody Recruiter recruiter) throws RecruiterAlreadyExistException{
		Recruiter save = recruiterService.saveRecruiter(recruiter);
		return new ResponseEntity<>(save, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Recruiter>> getAllRecruiters() {
		List<Recruiter> Recruiter = recruiterService.getAllRecruiters();
		return new ResponseEntity<>(Recruiter, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Recruiter>> getRecruiterById(@PathVariable long id) {
		Optional<Recruiter> recruiter = recruiterService.getRecruiterById();
		return new ResponseEntity<>(recruiter, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteRecruiterId/{id}")
	public ResponseEntity<String> deleteById(@PathVariable long id) {
		String delete = recruiterService.deleteById(id);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	}
	
	@PutMapping("/updateRecruiter/{id}")
	public ResponseEntity<Recruiter> updateRecruiter(@PathVariable long id,@RequestBody Recruiter  recruiter) throws InvalidRecruiterException{
		Recruiter update =recruiterService.updateRecruiter(id,recruiter);
		return new ResponseEntity<>(update, HttpStatus.ACCEPTED);
		
	}
}
