package com.testyanrea.abstraction;

public class GDrive extends Google {

	@Override
	void sharefile() {
		System.out.println("share filr only upto 15Gb");
	}

}
