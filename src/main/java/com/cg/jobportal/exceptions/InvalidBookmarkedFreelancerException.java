package com.cg.jobportal.exceptions;

public class InvalidBookmarkedFreelancerException extends Exception{
	
	private String msg;

	
	public InvalidBookmarkedFreelancerException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidBookmarkedFreelancerException() {
		super();
	}
}
