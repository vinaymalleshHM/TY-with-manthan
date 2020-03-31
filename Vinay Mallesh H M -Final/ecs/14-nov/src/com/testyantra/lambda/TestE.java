package com.testyantra.lambda;

import java.util.function.Supplier;

public class TestE {
	public static void main(String[] args) {
		
		
		Supplier<Student> sup = ()-> new Student("Latha", 56.7, 24);

		Student s = sup.get();


		System.out.println("Name is : "+s.name);
		System.out.println("Age is  : "+s.age);
		System.out.println("Perc is : "+s.perc);
	}
}
