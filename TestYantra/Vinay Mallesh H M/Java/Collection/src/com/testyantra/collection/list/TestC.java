package com.testyantra.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("simran");
		
		
		
		Iterator  it = al.iterator();
		while (it.hasNext()) {
			Object r =  it.next();
			System.out.println(r);
			
		}
	}
	

}
