package com.testyantra.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestP {
	public static void main(String[] args) {
		Vector <Character> v = new Vector<Character>();
		v.add('A');
		v.add('P');
		v.add('P');
		v.add('L');
		v.add('E');


		System.out.println("************* using for ***********");
		for (int i = 0; i < v.size(); i++) 
		{	
			Character r = v.get(i);
			System.out.println(r);
			System.out.println("*");
		}


		System.out.println("************* using foreach ***********");
		for (Character object : v) {

			System.out.println(object);
			System.out.println("-");

		}

		System.out.println("************* using Iterator ***********");
		Iterator <Character> it = v.iterator();
		while(it.hasNext()) 
		{
			Character r =it.next();
			System.out.println(r);

		}
		
		System.out.println("************* using ListIterator ***********");
		ListIterator<Character>  lit = v.listIterator();
		while(it.hasNext()) 
		{
			Character r =it.next();
			System.out.println(r);

		}

	}

}
