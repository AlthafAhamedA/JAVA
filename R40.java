abstract class A
{
	abstract void f1();
	abstract void f2();
	public void f3()
	{
		System.out.println("f3");
		
	}
}	

abstract class B extends A
{
		
	void f1()
	{
	
		System.out.println("f1");
	}
	
}

class R40 extends B
{
	void f2()
	{
		System.out.println("f2");
		
	}


	
public static void main(String[]args)
	{
	
		R40 x = new R40();
			x.f1();
			x.f2();
			x.f3();
	
	
	
	}

}	
	




	