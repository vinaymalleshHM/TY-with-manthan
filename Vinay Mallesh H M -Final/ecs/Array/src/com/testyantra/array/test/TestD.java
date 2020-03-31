package com.testyantra.array.test;

public class TestD {
	public static void main(String[] args) {
		
		Student s1 = new Student("Dimple",1,78.3);
		Student s2 = new Student("Chinnu",2,67.3);
		Student s3 = new Student("Raju",3,56.3);
		Student s4 = new Student("priya",4,78.3);
		
		
		Student[] s = new Student[4];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		
		for (Student student : s) {
			System.out.print(student.id);
			System.out.print(" "+student.name);
			System.out.println(" "+student.per);
			System.out.println("**************************");
		}
		
		
	}

}
