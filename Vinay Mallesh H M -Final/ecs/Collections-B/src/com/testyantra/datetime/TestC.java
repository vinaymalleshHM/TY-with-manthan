package com.testyantra.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestC {
	public static void main(String[] args) {
		
		
		LocalDateTime ldt = LocalDateTime.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy h:m a");
		String res = df.format(ldt);
		System.out.println(res);
		
	}

}
