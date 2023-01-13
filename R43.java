abstract class A
{
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

class R43 extends A	
{
	public static void main(String[]args)
	{
		R43 x = new R43();
		x.display();
		
	}
	
	void display()
	{
		super.show();	
		System.out.println("display");
		
	}
	

}	

	