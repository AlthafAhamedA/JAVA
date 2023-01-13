abstract class A
{
	abstract int add(int a, int b);
	abstract void sub(int a, int b);
	void mul(int a, int b)
	{
		a =10; b=20;
		int c = a*b;
		System.out.println(c);
		
		
	}
	void div(int a, int b)
	{
		 a=20; b=5;
		int c = a/b;
		System.out.println(c);
		
		
	}
}

class R39 extends A
{
		int add(int a,int b)
		{	
			int c = a+b;
			System.out.println(c);
			return c;
			
			
		}
		void sub(int a,int b)
		{
			int c = a-b;
			System.out.println(c);
		}	
		
		public static void main(String[]args)
		{
			R39 x = new R39();		
			x.mul(1,1);
			x.div(1,1);
			x.add(1,1);
			x.sub(1,1);
			
			
			
		}

}
		


		