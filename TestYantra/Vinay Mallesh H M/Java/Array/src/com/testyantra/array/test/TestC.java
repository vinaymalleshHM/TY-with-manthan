package com.testyantra.array.test;

import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		
		
		String r = "Dimple";
		
		char[] a=r.toCharArray();
		
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
		for (char c : a) {
			System.out.println(c);
		}
		
		System.out.println("**************************");
		
		double [] d = new double[] {25.23,256.0,12.00,25.36};
		
		for (double e : d) {
			System.out.println(e);
		}
	}

}
