package com.student.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		validationErrorResponse validationErrorResponse = new validationErrorResponse(HttpStatus.BAD_REQUEST,
				"Validation error", null);
		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage)
				.collect(Collectors.toList());
		validationErrorResponse.setErrors(errors);
		return new ResponseEntity<>(validationErrorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(StudentAlreadyExistsException.class)
	public ResponseEntity<Object> handleStudentAlreadyExistsException(StudentAlreadyExistsException ex) {
		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT, "Employee already exists");
		return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
	}

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<Object> handleStudentNotFoundException(StudentNotFoundException ex) {
		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND, "Employee does not exists");
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception ex) {
		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error");
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
