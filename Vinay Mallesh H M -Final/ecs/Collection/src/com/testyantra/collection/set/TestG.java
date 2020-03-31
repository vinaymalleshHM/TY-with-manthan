package com.testyantra.collection.set;

import java.util.TreeSet;

public class TestG {
	public static void main(String[] args) {
		Person p1 = new Person("Dimple", 1, 1.75);
		Person p2 = new Person("Priya", 45, 1.75);
		Person p3 = new Person("Dingi", 3, 2.75);
		Person p4 = new Person("Winay", 4, 3.75);
		
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(p1);
		ts.add(p3);
		ts.add(p2);
		ts.add(p4);
		
		

		for (Person person : ts) 
		{
			System.out.println("name is "+person.name);
			System.out.println("id is "+person.id);
			System.out.println("height is "+person.height);
			System.out.println("******************************");
		}
	}

}
