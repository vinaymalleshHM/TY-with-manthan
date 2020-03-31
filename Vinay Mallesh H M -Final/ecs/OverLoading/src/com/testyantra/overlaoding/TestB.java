package com.testyantra.overlaoding;

public class TestB {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("Dimple");
		
		
		DB d = new DB();
		d.save(s);
	}

}
