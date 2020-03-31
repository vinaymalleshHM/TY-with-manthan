
public class TsetH 
{
	public static void main(String[] args)
	{
		Scientific s = new Scientific();
		s.cost=100;
		s.add();
		s.mul();
		s.sin();
		s.cos();
		
		System.out.println("cost is "+s.cost);
		System.out.println("*****************************");
		
		Calculator cal= new Calculator();
		cal.cost=50;
		cal.add();
		cal.mul();
		
		System.out.println("cost is "+cal .cost);
	}
}
