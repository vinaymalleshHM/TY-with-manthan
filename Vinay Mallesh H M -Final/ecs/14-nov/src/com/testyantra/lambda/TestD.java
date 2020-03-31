package com.testyantra.lambda;

import java.util.function.Consumer;

public class TestD {
	public static void main(String[] args) {
		
		Student st = new Student("Dimple", 68.56, 21);
		
		Consumer<Student> c = s->{
			System.out.println("Name is : "+s.name);
			System.out.println("Age is  : "+s.age);
			System.out.println("Perc is : "+s.perc);
		};
		c.accept(st);
	}
}
