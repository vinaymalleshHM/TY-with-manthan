package com.testyantra.object.test;

public class TestC {
	public static void main(String[] args) {
		 
		
		Animal a = new Cow();//up casting
		a.cost=30;
		System.out.println("cost is "+a.cost);
		a.eat();
		
		
		Cow c = (Cow)a;//down casting
		c.cost=25;
		c.eat();
		c.size=25.36;
		c.run();
		
		System.out.println("cost is "+c.cost);
		
		System.out.println("size is "+c.size);
	}

}
