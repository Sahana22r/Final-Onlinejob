package com.cg.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Job;

import com.cg.jobportal.service.JobsService;

/************************************************************************************
 * @author sahana
 * Created Date: 23 January, 2023 
 * Description: This class is the controller for the job module
 ************************************************************************************/
@RestController
public class JobController {
	
	
	@Autowired
	JobsService js; 
	
	/*******************************************************************************************
	 * @param job
	 * @return       Response Entity of Object type
	 * Description : This method posts a new job.
	 * @PostMapping: Annotation for mapping HTTP POST requests onto specific handler methods.
	 *******************************************************************************************/
	@PostMapping("/postJob")
	public ResponseEntity<Object> job(@RequestBody Job job) {
		js.addjob(job);
		return new ResponseEntity<>("Job Posted Successfully", HttpStatus.OK);
	}
	
	
	@GetMapping("/findAllJobPost")
	public ResponseEntity<Object> findAll() {
		return new ResponseEntity<>(js.findAll(), HttpStatus.OK);
	}
	
	/*********************************************************************************************
	 * @param id
	 * @return       Response Entity of Job type
	 * Description : This method finds a job by id
	 * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
	 **********************************************************************************************/
	@GetMapping(value = "/findJobById/{id}")
	public ResponseEntity<Object> findById(@PathVariable long id) {
			return new ResponseEntity<>(js.findById(id), HttpStatus.OK);
	}

	/**********************************************************************************************
	 * @param id
	 * @return  Response Entity of Job type
	 * @DeleteMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
	 **********************************************************************************************/
	@DeleteMapping("/deletejob/{id}")
	public ResponseEntity<Object> deletejob(@PathVariable long id) {
			js.deletejob(id);
		return new ResponseEntity<>("deleted successfully", HttpStatus.OK);

	}
}
