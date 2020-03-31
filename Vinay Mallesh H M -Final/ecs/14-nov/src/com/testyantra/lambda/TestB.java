package com.testyantra.lambda;

import java.util.function.Function;

public class TestB {
	public static void main(String[] args) {
		
		Function<String, Integer> fn = x-> x.length();
		int ans = fn.apply("Venki Testyantra");
		System.out.println("Length is "+ans);
	}
}
