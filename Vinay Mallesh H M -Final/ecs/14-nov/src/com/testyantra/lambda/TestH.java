package com.testyantra.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestH {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		
		Comparator<Integer> c = (i,j)->i.compareTo(j);
		
		Integer bl = al.stream().max(c).get();
		System.out.println(bl);
		Integer bl1 = al.stream().min(c).get();
		System.out.println(bl1);
		              
	}

}
