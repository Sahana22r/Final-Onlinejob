package com.cg.jobportal.exceptions;

public class InvalidFeedbackException extends Exception {
	private String msg;

	public InvalidFeedbackException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidFeedbackException() {
		super();
	}

}
