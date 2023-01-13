//Return type with arguments


class R10
{
	public static void main(String[]args)
	{
		int a = add(5); // storing the return value accordingly
		System.out.println(a);
		R10 x = new R10();
		int b = x.mul(5);
		int c = b ;
		System.out.println(c+10); // accessing local variable 
		
		
	}

	static int add(int a)
	{
		int b= 10;
		int c = b+a;
		System.out.println(c);
		return b;
		
	}
	
	
	
	int mul (int b)
	{
		
		int z=3;
		return z;
		
	}
	
	

}

	