package com.testyantra.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestO {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(2.4);
		v.add(15);
		v.add("Dimple");


		System.out.println("************* using for ***********");
		for (int i = 0; i < v.size(); i++) 
		{	
			Object r = v.get(i);
			System.out.println(r);
			System.out.println("*");
		}


		System.out.println("************* using foreach ***********");
		for (Object object : v) {

			System.out.println(object);
			System.out.println("-");

		}

		System.out.println("************* using Iterator ***********");
		Iterator it = v.iterator();
		while(it.hasNext()) 
		{
			Object r =it.next();
			System.out.println(r);

		}
		
		System.out.println("************* using ListIterator ***********");
		ListIterator  lit = v.listIterator();
		while(it.hasNext()) 
		{
			Object r =it.next();
			System.out.println(r);

		}



	}



}

