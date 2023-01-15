class R30
{
	R30()
	{
		this("alt");
		
		System.out.println("1");
	}	
	
	R30(int a)
	{
		this("4");
		System.out.println("2");
		
	}
	
	R30(String S)
	{
		System.out.println("3");
	}	
	
	public static void main(String[]args)
	{
		R30 x = new R30();
		R30 y = new R30(2);
		
	}

}	