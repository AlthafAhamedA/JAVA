//return type and without arguments

class R8
{
	public static void main(String[]args)
	
	{
		
		
		int b = mul();
		System.out.println(b);
		
		R8 x = new R8();
		int y =x.add();
		/*int z = y + x.c;  // local variable can't be accessed. So, that arguments shoule be passed. 
  		System.out.println(z);
		*/
	}
	
	static int mul()
	{
		
		int a =10;
		return a;
	}
	
	int add()
	{
		
		int b = 20, c =30;
		System.out.println(c);
		return b;
	
	
	
	}
	
}	


	