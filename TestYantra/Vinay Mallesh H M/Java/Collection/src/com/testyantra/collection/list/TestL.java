package com.testyantra.collection.list;

import java.util.LinkedList;

public class TestL {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(23);
		li.add(2.4);
		li.add('f');
		li.add("Dimple");
		
		
		
		for (Object object : li) {
			
			System.out.println(object);
			System.out.println("-");
			
		}
	}

}
