package com.testyantra.collectionB.set;

import java.util.Comparator;


public class StudentByPer implements Comparator<Student> {


	public int compare(Student o1, Student o2) {
		/*
		Double a = o1.percentage;
		Double b = o2.percentage;
		
		return a.compareTo(b)-1;*/
		
		
		
		
		
		
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

	}

}
