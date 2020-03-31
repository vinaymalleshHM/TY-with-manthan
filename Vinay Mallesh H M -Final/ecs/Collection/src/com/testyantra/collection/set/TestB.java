package com.testyantra.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Priya");
		hs.add("14");
		hs.add("Dimple");
		hs.add("Winay");
		hs.add("Winay");
		
		System.out.println("************* using foreach ***********");
		for (Object object : hs) {

			System.out.println(object);
			
		}
		
		System.out.println("************* using Iterator ***********");
		Iterator it = hs.iterator();
		while(it.hasNext()) 
		{
			Object r =it.next();
			System.out.println(r);
			


		}

	}

}
