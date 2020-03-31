
public class TestB
{
	public static void main(String[] args) 
	{
		Van v=new Van();
		v.cost=120.45;
		v.model=2019;
		v.move();
		v.stop();
		System.out.println("the cost of car is "+v.cost);
		System.out.println("the model of car is "+v.model);
	}
}
