package com.student.exception;

public class StudentAlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public StudentAlreadyExistsException(String message) {
		super("Employee Already exist");
	}

}
