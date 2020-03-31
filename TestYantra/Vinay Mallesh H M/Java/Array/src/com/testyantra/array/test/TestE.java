package com.testyantra.array.test;

public class TestE {
	public static void main(String[] args) {
		
		
		int [] x = new int[] {1,2,3,4};
		
		Demo d = new Demo();
		d.eat(x);
		System.out.println("+++++++++++++++++++++++++++++");
		double[] s = d.getMe();
		
		for (double e : s) {
			System.out.println(e);
		}
	}

}
