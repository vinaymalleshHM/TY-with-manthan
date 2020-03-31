package com.testyantra.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Prince");
		hs.add("ghjghj");
		hs.add("Dimple");
		hs.add("Winay");
		
		
		System.out.println("************* using foreach ***********");
		for (String object : hs) {

			System.out.println(object);
			
		}
		
		System.out.println("************* using Iterator ***********");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) 
		{
			String r =it.next();
			System.out.println(r);
			


		}
	}

}
