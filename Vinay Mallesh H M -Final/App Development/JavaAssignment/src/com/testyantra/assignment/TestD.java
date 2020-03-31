package com.testyantra.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestD {
	public static void main(String[] args) {

		HashMap<String, String> hm = new  HashMap<String, String>();  
		hm.put("Sidhartha", "12345");
		hm.put("RaniCheannamma", "67890");
		hm.put("shathabdi", "56558");
		hm.put("Dinga", "96622");
		hm.put("Dimple","89832");
		//System.out.println(hm);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente Train Name");
		String s = sc.next();
		
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		Set<Map.Entry<String, String>> set	= hm.entrySet();
		for (Map.Entry<String, String> entry : set) {
			//al1.add(entry.getKey());
			//al2.add(entry.getValue());
			
			if(hm.containsKey(s)) {
				String a = entry.getKey();
				String aa = entry.getValue();
				System.out.println("Train Found "+a);
				System.out.println("Train Found no "+aa);
			}
			else if(hm.containsValue(s)) {
				String a = entry.getKey();
				String aa = entry.getValue();
				
				System.out.println("Train Found "+a);
				System.out.println("Train Found no "+aa);
			}
			else {
				System.out.println("Invalid Input");
			}
			
	} 
		
		
	}

}


