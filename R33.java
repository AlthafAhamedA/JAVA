class A
{
	int e =11;
	void f1()
	{
		System.out.println(e);
	}
}

class B extends A
{
		int f1(int a, int b)
		{
			int c = a+b;
			return c;
		}
}		
	
class R33
{
		public static void main(String[]args)
		{
				B x = new B();	
			System.out.println(x.f1(5,6));
			System.out.println(int c=x.f1());
			
		}
}		
		
	