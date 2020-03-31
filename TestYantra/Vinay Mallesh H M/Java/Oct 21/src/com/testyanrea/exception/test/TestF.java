package com.testyanrea.exception.test;

public class TestF {
	public static void main(String[] args) {
		System.out.println("main started ");

		Paytm p  =new Paytm();
		//try
		//{
		p.book();
		/*}
		catch(ArithmeticException a) 
		{
			System.out.println("Exception caught at main");
		}*/
		System.out.println("main ended ");
	}

}
