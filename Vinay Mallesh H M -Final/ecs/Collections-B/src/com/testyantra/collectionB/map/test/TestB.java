package com.testyantra.collectionB.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestB {
	public static void main(String[] args) {
		LinkedHashMap<Character, String> hm = new LinkedHashMap<Character, String>();
		hm.put('M',"man");
		hm.put('A',"man");
		hm.put('a',"man");
		hm.put('f',"man");


		Set<Map.Entry<Character, String>> se = hm.entrySet();


		for (Map.Entry<Character, String> x : se) 
		{
			Character k = x.getKey();
			String v = x.getValue();
			System.out.println("Key "+k);
			System.out.println("Value "+v);
			System.out.println("****************************");

		}
	}
}
