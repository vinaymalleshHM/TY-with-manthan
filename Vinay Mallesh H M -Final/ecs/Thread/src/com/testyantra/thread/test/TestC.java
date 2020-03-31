package com.testyantra.thread.test;

public class TestC {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		PVR i = new PVR();
		
		User t1 = new User(i);
		t1.start();
		
		User t2 = new User(i);
		t2.start();
		
		i.leaveme();
		System.out.println("Main ended");
	}

}
