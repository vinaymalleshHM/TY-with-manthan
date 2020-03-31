package com.testyantra.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestB {
	public static void main(String[] args) {
		
		
		LocalDate ld =LocalDate.now();
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s = dt.format(ld);
		
		System.out.println(s);
	}

}
