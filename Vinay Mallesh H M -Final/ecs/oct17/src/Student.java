
public class Student 
{
	int id;
	String name;
	double percentage;
	
	

	public Student(int id, String name, double percentage) 
	{
		
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}




	void display()
	{
		
		System.out.println("Id is "+id);
		System.out.println("name is "+name);
		System.out.println("percentage is "+percentage);
	}
}
