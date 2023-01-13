class R16
{
	public static void main(String[]args)
	{
	
		R16 x = new R16();
		x.sum1(1,2);
		System.out.println(x.sum2(1,2));
		System.out.println(x.sum3(1));
		
	}
	
	void sum1(int a, int b)
	{
			 a =10; b=20;
			int c = a+b;
			System.out.println(c);	
	}
	
	int sum2(int a, int b)
	{
		 a = 15; b=20;
		int c = a+b;
		return c;
	}

	int sum3(int a)
	{

	int total = a;
	return total;

	}	
	
}	