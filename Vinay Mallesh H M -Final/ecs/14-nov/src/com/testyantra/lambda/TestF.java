package com.testyantra.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestF {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
//      System.out.println(al);
//		ArrayList<Integer> bl = new ArrayList<Integer>();
//
//
//		for (Integer r : al) {
//			if (r%2 !=0) {
//				bl.add(r);
//			}
//		}
//		System.out.println(bl);
//		System.out.println(p.test(25));
		
				Predicate<Integer> p = i-> i%2 !=0;
		
		List<Integer> bl = al.stream().filter(p).collect(Collectors.toList());
		System.out.println(bl);
	}
}
