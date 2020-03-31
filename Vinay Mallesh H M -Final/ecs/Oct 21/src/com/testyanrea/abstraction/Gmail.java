package com.testyanrea.abstraction;

public class Gmail extends Google {

	@Override
	void sharefile() {
		System.out.println("share filr only upto 25MB");
	}

}
