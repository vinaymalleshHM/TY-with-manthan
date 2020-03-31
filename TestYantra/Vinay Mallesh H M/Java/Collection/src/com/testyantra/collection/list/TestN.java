package com.testyantra.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestN {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("priya");
		li.add("uu");
		li.add("lm");
		li.add("Dimple");


		System.out.println("************* using for ***********");
		for (int i = 0; i < li.size(); i++) 
		{	
			String r = li.get(i);
			System.out.println(r);
			System.out.println("*");
		}


		System.out.println("************* using foreach ***********");
		for (String object : li) {

			System.out.println(object);
			System.out.println("-");

		}

		System.out.println("************* using Iterator ***********");
		Iterator <String>it = li.iterator();
		while(it.hasNext()) 
		{
			String r =it.next();
			System.out.println(r);

		}
		
		
		System.out.println("************* using Iterator ***********");
		ListIterator <String> lit = li.listIterator();
		while(lit.hasNext()) 
		{
			String r =lit.next();
			System.out.println(r);

		}
		
		
	}
}
