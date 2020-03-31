package com.testyantra.object.test;

public class TestB {
	public static void main(String[] args) {

		Student s = new Student("Dimple",1,78.6);
		
		Student s1 = new Student("Dimple",1,78.6);
		
		boolean b =s.equals(s1);
		
		System.out.println(b);
		
		 //System.out.println(s);
	}

}
