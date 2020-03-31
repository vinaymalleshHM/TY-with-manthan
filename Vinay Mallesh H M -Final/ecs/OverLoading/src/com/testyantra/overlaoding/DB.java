package com.testyantra.overlaoding;

public class DB {
	
	
	void save(Student stu) {
		System.out.println("Student data storing in DB");
		System.out.println("Student id is "+stu.getId());
		System.out.println("Student name is "+stu.getName());
	}

}
