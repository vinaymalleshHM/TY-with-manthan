package com.testyantra;

public class AnimalSimulator {
	void makenoise(Animal a) {
		if(a instanceof Animal )
		{
		a.noise();
		}
		else if(a instanceof Dog )
		{
		a.noise();
		}
		else if(a instanceof Cow )
		{
		a.noise();
		}
		else if(a instanceof Cat )
		{
		a.noise();
		}
		else
		{
			System.out.println("it's not a animal noise");
		}
	}

}
