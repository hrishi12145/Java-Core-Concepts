package com.virtusa.GlobalExceptions;

// Here I am creating a Global Exception and using this Exception in complete project 
public class NotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
		super(message);

	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

}
