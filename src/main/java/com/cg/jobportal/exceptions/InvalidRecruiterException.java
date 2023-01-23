package com.cg.jobportal.exceptions;

public class InvalidRecruiterException extends Exception {
	
	private String msg;

	public InvalidRecruiterException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidRecruiterException() {
		super();
	}

}
