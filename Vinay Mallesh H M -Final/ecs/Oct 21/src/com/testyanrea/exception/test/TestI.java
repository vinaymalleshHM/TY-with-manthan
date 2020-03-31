package com.testyanrea.exception.test;

public class TestI {
	public static void main(String[] args) {
		System.out.println("main started");
		ATMSimulator am = new ATMSimulator();
		try
		{
		am.verify(250000);
		}
		catch(DayLimitException l) {
			System.out.println(l.getMessage());
			
		}
		System.out.println("main ended");
	}
}
