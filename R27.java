// inheritance
class A
{
	void shape()
	{
	System.out.println("This is Shape");
	}	
}

class B extends A
{
	void square()
	{
	System.out.println("This is Square");
	}
}

class C extends A
{
	void circle()
	{
	System.out.println("This is circle");
	}
}

class R27 extends B
{
	public static void main(String[]args)
	{
		System.out.println("Square is Rectangle");
		R27 x = new R27();
		x.square();
		x.shape();
		
		
		
	}
}	


	
	