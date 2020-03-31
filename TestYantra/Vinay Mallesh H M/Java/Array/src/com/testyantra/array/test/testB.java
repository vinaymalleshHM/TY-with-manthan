package com.testyantra.array.test;

public class testB {
	public static void main(String[] args) {
		
		
		String[] st = {"Dimple","chinnu","raju","priya"};
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		 
		System.out.println("*********** reverse order ************");
		
		for (int i = st.length-1; i >= 0; i--) {
			System.out.println(st[i]);
		}
	}

}
