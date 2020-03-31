package com.testyanrea.abstraction;

public class TestA {
	public static void main(String[] args) {
		GDrive g = new GDrive();
		Gmail gg = new  Gmail();
		Broswer b = new Broswer();
		//b.account(g);
		b.account(gg);
			
	}
}
