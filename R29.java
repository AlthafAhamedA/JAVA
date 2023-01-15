// this keyword

class R29
{
	int c;
	String d;
	
	R29(int c, String d)
	{
		this.c=c;   //this keyword
 		this.d=d;   //this keyword
		
		
	}

	public static void main(String[]args)
	{
		R29 x = new R29(5,"10");
		
		System.out.println(x.c);
		System.out.println(x.d);
	}
}	