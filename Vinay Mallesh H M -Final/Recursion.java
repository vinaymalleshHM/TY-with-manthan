class Recursion
{
	static int fact(int a)
	{
		if(a==0)
		{
			return 1;
		}
		return a*fact(a-1);
	}
	public static void main(String ar[])
	{
		int res=fact(7);
		System.out.println("fact is "+res);
		
	}
}