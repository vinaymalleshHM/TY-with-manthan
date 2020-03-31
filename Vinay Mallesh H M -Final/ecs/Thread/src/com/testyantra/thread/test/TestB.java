package com.testyantra.thread.test;

public class TestB {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started");
		MyTask mt1 = new MyTask();
		mt1.start();
		MyTask mt2 = new MyTask();
		mt2.start();
		
		/*mt1.join();
		mt2.join();*/
		
		System.out.println("Main ended");
	
}

}
