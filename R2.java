abstract class A
{
	int a=10;
	A()
	{
			System.out.println("Java");
	}
	
	public void show()
	{
			System.out.println("Show");
	}

	abstract void display();
}

class R2 extends A
{
	
	R2()
	{
		super();
		System.out.println("B constructor");
		
	}	

	public static void main(String[]args)
	{
		R2 x = new R2();
		x.display();
	}

	void display()
	{
		
		super.show();
		System.out.println(super.a);
	}

}	