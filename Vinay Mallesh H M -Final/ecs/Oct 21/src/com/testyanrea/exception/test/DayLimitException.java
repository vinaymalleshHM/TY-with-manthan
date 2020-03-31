package com.testyanrea.exception.test;

public class DayLimitException extends RuntimeException {
	
	private String message = "sorry you crossed the day limit";
	
	public DayLimitException() {
		
	}

	public DayLimitException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
