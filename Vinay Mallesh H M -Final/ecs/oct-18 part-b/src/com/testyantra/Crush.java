package com.testyantra;

public class Crush {
	
	void reciive(Phone p)
	{
		if(p instanceof MI) 
		{
			System.out.println("Thank you brother");
		}
		
		else if(p instanceof Pixel) 
		{
			System.out.println("Thank you Dear");
		}
		
		else if(p instanceof Iphone) 
		{
			System.out.println("I love You");
		}
		else
		{
			System.out.println("go to hell");
		}
	}

}
