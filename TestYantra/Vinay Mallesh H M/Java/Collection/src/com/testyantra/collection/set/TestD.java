package com.testyantra.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("Prince");
		hs.add(2.5);
		hs.add("Dimple");
		hs.add(5);
		
		
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
