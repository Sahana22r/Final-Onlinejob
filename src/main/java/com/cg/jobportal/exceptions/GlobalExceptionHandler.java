package com.cg.jobportal.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = AdminAlreadyExistException.class)
	public ResponseEntity<String> adminAlreadyExistException(AdminAlreadyExistException msg) {
		return new ResponseEntity<String>("Admin Already Exist,Please Try Again.", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = RecruiterAlreadyExistException.class)
	public ResponseEntity<String> RecruiterAlreadyExistsException(RecruiterAlreadyExistException user) {
		return new ResponseEntity<String>("Recruiter already exist", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = BookmarkedFreelancerAlreadyExistsException.class)
	public ResponseEntity<String> BookmarkedFreelancerAlreadyExistsException(
			BookmarkedFreelancerAlreadyExistsException msg) {
		return new ResponseEntity<String>("Bookmarked freelancer already exists, please try with another freelancer",
				HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = NoBookmarkedFreelancerExistsException.class)
	public ResponseEntity<String> NoBookmarkedFreelancerExistsException(NoBookmarkedFreelancerExistsException msg) {
		return new ResponseEntity<String>(" No bookmarked freelancer exists", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = InvalidAdminException.class)
	public ResponseEntity<String> invalidAdminException(InvalidAdminException msg) {
		return new ResponseEntity<String>("Admin Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=JobApplicationNotFoundException.class)
	public ResponseEntity<String> jobApplicationNotFoundException(JobApplicationNotFoundException msg){
		return new ResponseEntity<>("The entered job application id doesnt exist",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = JobApplicationAlreadyExistException.class)
	public ResponseEntity<String> jobApplicationAlreadyExistException(JobApplicationAlreadyExistException msg) {
		return new ResponseEntity<>("JobApplication Already Exist,Please Try Again.", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = InvalidJobApplicationException.class)
	public ResponseEntity<String> invalidJobApplicationException(InvalidJobApplicationException msg) {
		return new ResponseEntity<String>("Job Application Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = InvalidJobException.class)
	public ResponseEntity<String> invalidJobException(InvalidJobException msg) {
		return new ResponseEntity<String>("Job Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = JobAlreadyExistException.class)
	public ResponseEntity<String> jobAlreadyExistException(JobAlreadyExistException msg) {
		return new ResponseEntity<>("Job Already Exist,Please Try Again.", HttpStatus.CONFLICT);
	}
}