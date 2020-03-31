package com.testyantra.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestM {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(23);
		li.add(2.4);
		li.add('f');
		li.add("Dimple");
		
		
		System.out.println("************* using Iterator ***********");
		Iterator it = li.iterator();
		while(it.hasNext()) 
		{
			Object r =it.next();
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
