package com.testyantra.assignment;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		ChipsObj ch = new ChipsObj();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input\n K for KurKure\n L for Lays\n B for Bingo\n ");
		String s = sc.next();
		Chips c1= ch.getParObject(s);
		c1.eat();
	}

}
