package com.testyantra.thread.test;

public class TestD {
	public static void main(String[] args) {
		
		
		Pen x = new Pen();
		Thread t1 = new Thread(x);
		t1.start();
	}

}
