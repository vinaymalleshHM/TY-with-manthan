package com.testyantra.assignment;

public class TestA {
     public static void main(String[] args) {
		Animal a = new Cat();
		Animal b = new Dog();
		AnimalSimulator ae = new  AnimalSimulator();
		ae.simulator(a);
		ae.simulator(b);
		
	}
}
