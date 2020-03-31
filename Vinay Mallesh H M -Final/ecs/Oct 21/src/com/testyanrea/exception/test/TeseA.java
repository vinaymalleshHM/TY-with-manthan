package com.testyanrea.exception.test;

public class TeseA {
	public static void main(String[] args) {
		System.out.println("main started ");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("please dont divide by zero");
		}
		System.out.println("main ended ");
	}

}
