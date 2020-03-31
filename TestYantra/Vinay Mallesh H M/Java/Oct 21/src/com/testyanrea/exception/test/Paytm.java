package com.testyanrea.exception.test;

public class Paytm {
	void book() {
		System.out.println("book started");
		IRCTC i = new IRCTC();
		
		try
		{
			i.confirm();
		}
		catch(ArithmeticException a) 
		{
			System.out.println("Exception caught at book");
		}
		System.out.println("book ended");
	}

}
