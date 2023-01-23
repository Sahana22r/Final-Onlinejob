package com.cg.jobportal.exceptions;

public class SkillAlreadyExistsException extends Exception{
	
	private String msg;
	
	public SkillAlreadyExistsException(String msg) {
	super();
	this.msg = msg;
}
public SkillAlreadyExistsException() {
	super();
}
}