package com.testyantra.collection.set;

import java.util.HashSet;

public class TestE {
	public static void main(String[] args) {
		Person p1 = new Person("Dimple", 1, 1.75);
		Person p2 = new Person("Dimple", 45, 1.75);
		Person p3 = new Person("Dingi", 3, 2.75);
		Person p4 = new Person("Dimple", 4, 3.75);
		
		HashSet<Person> hs = new HashSet<Person>();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		
		
		
		for (Person person : hs) 
		{
			System.out.println("name is "+person.name);
			System.out.println("id is "+person.id);
			System.out.println("height is "+person.height);
			System.out.println("******************************");
		}
	}

}
