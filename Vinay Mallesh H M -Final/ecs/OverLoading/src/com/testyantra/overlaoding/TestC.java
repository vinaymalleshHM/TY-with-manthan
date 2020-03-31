package com.testyantra.overlaoding;

public class TestC {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Dimple");
		e.setGender('F');
		e.setSal(25000);
		
		
		EmpDB edb = new EmpDB();
		edb.save(e);
	}

}
