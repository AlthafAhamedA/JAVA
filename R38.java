abstract class A
{
	abstract int add();
	
	void sub()
	{
	
	System.out.println("Sum");
	
	}	
	
}
	
	
class R38 extends A
{
	
	int add()
	{
		return 0;
		
	}
	public static void main(String[]args)
	{
			R38 x = new R38();
			x.sub();
			System.out.println(x.add());
	
	}


}	