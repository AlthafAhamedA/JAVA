class R2
{
	int a =10; int b=20;                // instance variable  - inside the class and outside the method. 
										// same variable - multiple methods	 - non static methods
										
	public static void main(String[]args)  
	{	
		
		R2 x = new R2();
		int c = x.a + x.b;                //non static to static object has to be created
		System.out.println(c);
		x.sub();
	}
	
	void sub()
	{
	
		int c = b-a;                       // non static method no object creation
		System.out.println(c);
	}
	
	
}



