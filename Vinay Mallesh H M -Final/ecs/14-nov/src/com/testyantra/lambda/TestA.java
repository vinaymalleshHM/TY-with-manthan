package com.testyantra.lambda;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {

		Student st = new Student("Dimple", 68.56, 21);

		Predicate<Student> ps = s ->{
			if(st.perc>=35) {
				return true;
			}
			else {
				return false;
			}
		};
		
		boolean ans = ps.test(st);
		System.out.println("Result is"+ans);
	}
}
