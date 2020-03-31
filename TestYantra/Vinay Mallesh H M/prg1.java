class prg1
{
	
	 static int fact(int a)
	{
		int f=1;
		for(int i=1;i<=5;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String ar[])
	{
		int res=fact(5);
		System.out.println("fact is "+res);
		
	}
}