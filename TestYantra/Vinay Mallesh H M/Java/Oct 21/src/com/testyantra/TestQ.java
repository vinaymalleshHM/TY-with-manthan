package com.testyantra;

public class TestQ {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		Cow cc = new Cow();
		
		AnimalSimulator as = new AnimalSimulator();
		as.makenoise(d);
		as.makenoise(c);
		as.makenoise(cc);
		as.makenoise(null);	
	}

}
