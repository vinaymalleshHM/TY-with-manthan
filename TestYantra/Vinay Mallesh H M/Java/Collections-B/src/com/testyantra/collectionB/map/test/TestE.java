package com.testyantra.collectionB.map.test;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TestE {

	public static void main(String[] args) {
		TreeMap<Integer, String> ht = new TreeMap<Integer, String>();
		ht.put(25,"Man");
		ht.put(56,"Sf");
		ht.put(45,"Dimple");
		ht.put(55,"Priya");
		
		
		Set<Map.Entry<Integer, String>> se = ht.entrySet();


		for (Map.Entry<Integer, String> x : se) 
		{
			Integer k = x.getKey();
			String v = x.getValue();
			System.out.println("Key "+k);
			System.out.println("Value "+v);
			System.out.println("****************************");

		}
	}

}
