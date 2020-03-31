package com.testyanrea.exception.test;

public class TestJ {
	public static void main(String[] args) {
		
		
		AgeSimulator ag = new AgeSimulator();
		try {
			ag.verify(10);
			System.out.println("you are  allowed to enter");
		} 
		catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
	}

}
