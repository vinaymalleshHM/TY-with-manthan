package com.testyanrea.exception.test;

public class TestE {
	public static void main(String[] args) {

		System.out.println("main started ");
		int a[] = new int[3];
		String name=null;
		try
		{
			System.out.println(a[5]);
			//System.out.println(10/0);
			System.out.println("Hi...");
			System.out.println("Have a Good Day...");
			System.out.println(name.length());
		}
		catch(ArithmeticException am)
		{
			//System.out.println(am.getMessage());
			System.out.println("please dont divide by zero");
		}
		catch(NullPointerException ne)
		{
			System.out.println("Dont deal with Null");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Dont cross array boundary");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("I am general catch block");
			//e.printStackTrace();
		}

		System.out.println("main ended ");

	}
	}


