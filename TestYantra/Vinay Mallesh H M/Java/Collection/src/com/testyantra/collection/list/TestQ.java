package com.testyantra.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestQ {
	public static void main(String[] args) {
		Student s1 = new Student("Dimple", 1, 78.96);
		Student s2 = new Student("Priya", 2, 68.96);
		Student s3 = new Student("Dinga", 3, 98.96);
		Student s4 = new Student("Dingi", 4, 78.23);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);


		System.out.println("************* using for ***********");
		for (int i = 0; i < al.size(); i++) {

			/*Object r = al.get(i);
			Student s = (Student)r;

			System.out.println("Student name is "+s.name);
			System.out.println("Student name is "+s.id);
			System.out.println("Student name is "+s.percentage);
			System.out.println("***********************");*/

			Student s = al.get(i);
			System.out.println("Student name is "+s.name);
			System.out.println("Student name is "+s.id);
			System.out.println("Student name is "+s.percentage);
			System.out.println("***********************");

		}


		System.out.println("************* using foreach ***********");
		for (Student object : al) {

			System.out.println(object);
			System.out.println("Student name is "+object.name);
			System.out.println("Student name is "+object.id);
			System.out.println("Student name is "+object.percentage);
			System.out.println("***********************");
			System.out.println("-");

		}

		System.out.println("************* using Iterator ***********");
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) 
		{
			Student r =it.next();
			System.out.println(r);
			System.out.println("Student name is "+r.name);
			System.out.println("Student name is "+r.id);
			System.out.println("Student name is "+r.percentage);
			System.out.println("***********************");


		}

		System.out.println("************* using ListIterator ***********");
		ListIterator <Student> lit = al.listIterator();
		while(lit.hasNext()) 
		{
			Student r =lit.next();
			System.out.println(r);
			System.out.println("Student name is "+r.name);
			System.out.println("Student name is "+r.id);
			System.out.println("Student name is "+r.percentage);
			System.out.println("***********************");

		}

	}

}
