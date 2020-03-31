package com.testyantra.collectionB.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestA {
	public static void main(String[] args) {
		Student s1 = new Student(5, "Dimple", 78.6);
		Student s2 = new Student(3, "Winay" , 66.6);
		Student s3 = new Student(6, "Dinga" , 96.6);
		Student s4 = new Student(9, "Priya" , 35.6);

		StudentById ById = new StudentById();

		StudentByPer ByPer = new StudentByPer();


		TreeSet<Student> ts = new TreeSet<Student>(ByPer);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		/*ArrayList<Student> ts = new ArrayList<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		Collections.sort(ts,ById);*/


		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			Student student =  it.next();
			System.out.println("id is "+student.id);
			System.out.println("name is "+student.name);

			System.out.println("percentage is "+student.percentage);
			System.out.println("******************************");
		}
	}
}
