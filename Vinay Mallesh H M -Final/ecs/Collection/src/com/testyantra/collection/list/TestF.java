package com.testyantra.collection.list;

import java.util.ArrayList;

public class TestF {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double> ();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);
		
		for (int i = 0; i < al.size(); i++) 
		{
			Double r  = al.get(i);
			System.out.println(r);
		}
	}

}
