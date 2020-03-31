package com.testyantra.assignment;

public class ChipsObj {

	Chips getParObject(String s) {
		Chips c = null;
		if (s.equalsIgnoreCase("K")) {
			c = new KurKure();
		}
		else if (s.equalsIgnoreCase("L")) {
			c = new Lays();
		}
		else if (s.equalsIgnoreCase("B")) {
			c = new Bingo();
		}
		else {
			System.out.println("Inavlid input");
		}


		return c;
	}

}
