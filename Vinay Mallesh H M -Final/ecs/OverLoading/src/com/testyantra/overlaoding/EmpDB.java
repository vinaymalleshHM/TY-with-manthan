package com.testyantra.overlaoding;

public class EmpDB {
	
	void save(Employee emp) {
		System.out.println("Employee data storing in DB");
		System.out.println("Employee id is "+emp.getId());
		System.out.println("Employee name is "+emp.getName());
		System.out.println("Employee Gender is "+emp.getGender());
		System.out.println("Employee Sal is "+emp.getSal());
	}

}
