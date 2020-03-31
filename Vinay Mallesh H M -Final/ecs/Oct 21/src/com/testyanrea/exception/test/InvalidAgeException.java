package com.testyanrea.exception.test;

public class InvalidAgeException extends Exception{
	
private String message = "sorry you are too young";
	
	public InvalidAgeException() {
		
	}

	public InvalidAgeException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
