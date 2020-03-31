package com.testyanrea.exception.test;

public class TestD {
	public static void main(String[] args) {
		int a[] = new int[3];

		System.out.println("main started ");

		try
		{
			//System.out.println(a);
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			//System.out.println(ne.getMessage());
			System.out.println("Dont cross array boundary");
		}
		System.out.println("main ended ");
	}

}
