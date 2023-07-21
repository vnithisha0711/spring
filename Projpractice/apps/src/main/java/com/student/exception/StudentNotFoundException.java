package com.student.exception;

public class StudentNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	private final String errorMessage;

    public StudentNotFoundException(String message) {
        super("Employee not exist ");
        this.errorMessage = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
