package com.testyanrea.exception.test;

public class TestC {
	public static void main(String[] args) {

		System.out.println("main started ");
		String name=null;
		try
		{
			//System.out.println(10/0);
			System.out.println("Hi...");
			System.out.println("Have a Good Day...");
			System.out.println(name.length());
		}
		catch(ArithmeticException a)
		{
			//System.out.println(a.getMessage());
			
			System.out.println("please dont divide by zero");
			
			//a.printStackTrace();
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne.getMessage());
			System.out.println("Dont deal with Null");
		}

		System.out.println("main ended ");

	}
}
