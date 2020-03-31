package com.testyanrea.exception.test;

public class AgeSimulator {
	
	void verify(int age) throws InvalidAgeException {
		if(age < 18)
		{
			InvalidAgeException in = new InvalidAgeException("your a child");
			//InvalidAgeException in = new InvalidAgeException();
			throw in;
		}
	}

}
