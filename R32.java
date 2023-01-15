// overloading - static overloading - same class , samme method name but different arguments.
class R32
{
	void add(int a)
	{
		int c = a+10;
		System.out.println(c);
	}	
	
	void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}

	void add(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[]args)
	{
		R32 a = new R32();
		a.add(1);
		a.add(1,2);
		a.add(1,2,3);
		
	}
}	