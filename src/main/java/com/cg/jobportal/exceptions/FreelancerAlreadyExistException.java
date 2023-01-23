package com.cg.jobportal.exceptions;

public class FreelancerAlreadyExistException extends Exception {
	
	private String msg;

	public FreelancerAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}

	public FreelancerAlreadyExistException() {
		super();
	}

}
