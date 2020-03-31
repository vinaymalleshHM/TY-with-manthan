package com.testyantra.overlaoding;

public class Train {
	
	
	void search(int a) {
		System.out.println("searching train by number "+a);
	}
	
	
	
	public void search(String a) {
		System.out.println("searching train by name "+a);
	}


}
