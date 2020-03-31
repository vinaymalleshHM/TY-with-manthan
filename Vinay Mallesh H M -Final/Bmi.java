class Bmi
{
	public static void main(String ar[])
	{
		int h=165;
		double w=65.5;
		double res=w/(h*h);
		if(res<18.5)
		{
			System.out.println("under weight");
		}
		else if(res>=18.5 && res<25 )
		{
			System.out.println("normal");

		}

		else if(res>=25 && res<30  )
		{
			System.out.println("over weight");

		}
		
		else
		{
			System.out.println("obbse");

		}
		
		
	}
}