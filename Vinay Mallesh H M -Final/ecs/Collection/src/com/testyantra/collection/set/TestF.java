package com.testyantra.collection.set;

import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Dimple");
		ts.add("Dinga");
		ts.add("Priya");
		ts.add("Divya");
		
		for (String string : ts) {
			System.out.println(string);
		}
		
		
	}

}
