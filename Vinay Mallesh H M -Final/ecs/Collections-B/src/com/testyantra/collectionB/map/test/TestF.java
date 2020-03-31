package com.testyantra.collectionB.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.testyantra.collectionB.set.Student;

public class TestF {
	public static void main(String[] args) {
		
		
		Student s1 = new Student(5, "Dimple", 78.6);
		Student s2 = new Student(3, "Winay" , 66.6);
		Student s3 = new Student(6, "Dinga" , 96.6);
		Student s4 = new Student(9, "Priya" , 35.6);
		
		ArrayList<Student> ts = new ArrayList<Student>();
		ts.add(s1);
		ts.add(s2);
		
		
		ArrayList<Student> ts1 = new ArrayList<Student>();
		ts.add(s3);
		ts.add(s4);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("Man",ts);
		hm.put("Sf",ts1);
		
		Set<Map.Entry<String, ArrayList<Student>>> se = hm.entrySet();
		

		for (Map.Entry<String, ArrayList<Student>> x : se) 
		{
			String k = x.getKey();
			 ArrayList<Student> v = x.getValue();
			System.out.println("Key "+k);
			//System.out.println("Value "+v);
			//System.out.println("****************************");
			
			Iterator<Student> it = ts.iterator();
			while (it.hasNext()) {
				Student st = (Student) it.next();
				System.out.println("id is "+st.id);
				System.out.println("name is "+st.name);

				System.out.println("percentage is "+st.percentage);
				System.out.println("******************************");
				
			}

		}
		
		
		
	}

}
