package com.testyantra.lambda;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		Student st = new Student("Dimple", 68.56, 21);
		Function<Student, Student> fs = y ->{
			y.perc=y.perc+4;
			return y;
		};

		Student ans = fs.apply(st);
		System.out.println("Perc is "+ans.perc );
	}
}
