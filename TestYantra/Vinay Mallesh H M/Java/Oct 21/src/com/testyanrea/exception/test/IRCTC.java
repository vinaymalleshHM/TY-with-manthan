package com.testyanrea.exception.test;

public class IRCTC {
	void confirm() {
		System.out.println("confirm started");
		try
		{
			System.out.println(10/2);
		}
		catch(ArithmeticException a) 
		{
			System.out.println("Exception caught at confirm");
			throw a;
		}
		finally
		{
			System.out.println("confirm ended");
		}
		
		
	}

}
