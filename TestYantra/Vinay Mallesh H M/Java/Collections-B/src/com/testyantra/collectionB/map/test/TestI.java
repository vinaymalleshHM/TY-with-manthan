package com.testyantra.collectionB.map.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.testyantra.collectionB.set.Student;

public class TestI {

	public static void main(String[] args) {

		Comparator<Student> comId = (o1,o2)->{
			if(o1.id>o2.id)
			{
				return 1; 
			}
			else if(o1.id<o2.id)
			{ 
				return -1; 
			} 
			else 
			{ 
				return 0;
			}

		};
		
		
		Comparator<Student> comPer = (o1,o2)->{

			if(o1.percentage>o2.percentage)
			{
			return 1; 
			}
			else if(o1.percentage<o2.percentage)
			{ 
				return -1; 
			} 
			else 
			{ 
				return 0;
			}

		};
		Comparator<Student> comName = (o1,o2)->  o1.name.compareTo(o2.name);
		
		//Comparator<Student> comName = (o1,o2)-> { return o1.name.compareTo(o2.name);};
		
		

		Student s1 = new Student(5, "Dimple", 78.6);
		Student s2 = new Student(3, "Winay" , 66.6);
		Student s3 = new Student(6, "Dinga" , 96.6);
		Student s4 = new Student(9, "Priya" , 35.6);

		TreeSet<Student> t = new TreeSet<Student>(comName);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4); 

		Iterator<Student> it = t.iterator();
		while (it.hasNext()) {
			Student st =  it.next();
			System.out.println("id is "+st.id);
			System.out.println("name is "+st.name);

			System.out.println("percentage is "+st.percentage);
			System.out.println("******************************");

		}
	}

}
