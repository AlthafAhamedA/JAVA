interface A
{
	void f1();
	void f2();
}
interface B 
{
	void f3();
	void f4();

}	



abstract class C implements B,A   //multiple inheritance possible
{
	public void f1()
	{
		System.out.println("f1");
			
	}	
	
	public void f2()
	{
		
	System.out.println("f2");	
		
	}	
	
}

abstract class D extends C
{
		public void f3()
		{
				System.out.println("f3");
			
		}	
		
}

class R42 extends D
{
		public void f4()
		{
		System.out.println("f4");	
			
		}	
		
		
		public static void main(String[]args)
		{
			
			R42 x = new R42();
			x.f4();
			x.f3();
			x.f2();
			x.f1();
			
			
		}	
	
}	
	










		