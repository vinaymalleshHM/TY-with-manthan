package com.testyantra.object.test;

public class TestA {
	public static void main(String[] args) {
	
		Student s = new Student("Dimple",1,78.6);
		
		Student s1 = new Student("Dimple",1,78.6);
		
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		//boolean b =s.equals(s1);
		
		//System.out.println(b);
		
		 //System.out.println(s);
		
		
		
//		int i  =  s.hashCode();
//		
//		System.out.println(i);
//		
//		String n = s.toString();
//		
//		System.out.println(n);
	}
}
