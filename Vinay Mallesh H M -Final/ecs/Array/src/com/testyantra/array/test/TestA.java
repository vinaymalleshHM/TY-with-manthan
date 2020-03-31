package com.testyantra.array.test;

public class TestA {
	public static void main(String[] args) {


		int  a [] = {1,2,3,4};

		/*a[0] = 24;
		a[1] = 10;
		a[2] = 16;
		a[3] = 4;*/


		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
       System.out.println("**************************");
       
		double []d = new double[4];

		d[0] = 24.05;
		d[1] = 10.36;
		d[2] = 16.56;
		d[3] = 4;


		for(int i=0; i<d.length;i++) {
			System.out.println(d[i]);
		}

		System.out.println("**************************");

		char [] c = new char[4];

		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		c[3] = 'd';


		for(int i=0; i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("**************************");

		String [] s = new String[4];

		s[0] = "Dimple";
		s[1] = "chinnu";
		s[2] = "raju";
		s[3] = "priya";


		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}





	}



}
