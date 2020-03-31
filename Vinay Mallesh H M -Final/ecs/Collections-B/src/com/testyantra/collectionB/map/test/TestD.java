package com.testyantra.collectionB.map.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestD {
	public static void main(String[] args) {
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		hm.put("Man",25);
		hm.put("Sf",56);
		hm.put("Dimple",45);
		hm.put("Priya",55);


		Set<Map.Entry<String, Integer>> se = hm.entrySet();


		for (Map.Entry<String, Integer> x : se) 
		{
			String k = x.getKey();
			Integer v = x.getValue();
			System.out.println("Key "+k);
			System.out.println("Value "+v);
			System.out.println("****************************");

		}
	}

}
