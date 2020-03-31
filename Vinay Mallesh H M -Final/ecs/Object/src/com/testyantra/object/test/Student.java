package com.testyantra.object.test;

public class Student {
	
	String name;
	int id;
	double percetage;
	
	
	public Student(String name, int id, double percetage) {
		this.name = name;
		this.id = id;
		this.percetage = percetage;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", percetage=" + percetage + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(percetage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(percetage) != Double.doubleToLongBits(other.percetage))
			return false;
		return true;
	}




	
	
	
	
	

}
