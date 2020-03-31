package com.testyantra.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double> ();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);
		
ListIterator <Double> lit =  al.listIterator();
		
		System.out.println("----------------->forward");
		while (lit.hasNext()) {
			Double r =  lit.next();
			System.out.println(r);
			
		}
		
		System.out.println("<-----------------backward");
		while (lit.hasPrevious()) {
			Double r =  lit.next();
			System.out.println(r);
		}

	}

}
