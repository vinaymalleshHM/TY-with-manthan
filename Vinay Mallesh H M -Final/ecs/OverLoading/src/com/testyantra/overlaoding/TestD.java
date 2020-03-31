package com.testyantra.overlaoding;

public class TestD {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.age=22;
		p.m.model=2018;
		p.m.docall();
		p.walk();
		
		System.out.println("person age is "+p.age);
		System.out.println("Mobile model is "+p.m.model);
	}

}
