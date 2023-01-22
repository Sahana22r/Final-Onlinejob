package com.cg.jobportal.exceptions;

public class InvalidFreelancerException extends Exception{
	
	private String msg;

	public InvalidFreelancerException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidFreelancerException() {
		super();
	}

}
 
