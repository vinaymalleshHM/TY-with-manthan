package com.testyantra.collectionB.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestA {
	public static void main(String[] args) {
		HashMap<Character, String> hm = new HashMap<Character, String>();
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
