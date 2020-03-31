package com.testyantra.assignment;

import java.util.List;
import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		ListObj list = new ListObj();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input\n A for ArrayList\n L for LinkedList\n v for Vector\n ");
		String s = sc.next();
		List l =list.objList(s);
		System.out.println(l);
	}

}
