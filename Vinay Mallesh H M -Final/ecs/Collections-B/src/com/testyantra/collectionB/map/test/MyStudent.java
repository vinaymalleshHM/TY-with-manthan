package com.testyantra.collectionB.map.test;

import java.util.Comparator;

import com.testyantra.collectionB.set.Student;

public interface MyStudent {
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

}
