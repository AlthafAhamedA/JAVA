interface AA
 {
	 int a = 10;  //public static final
	 void add();  //public abstract void
	 void sub();
 }
 
 
 class R41 implements AA
 {
	 public void add()
	 {
		 System.out.println("Add");
			
	 }
	
	public void sub()
	{
		
	System.out.println("Sub");	
		
	}
	public static void main(String[]args)
	{
		R41 x = new R41();
		System.out.println(x.a);	
		x.add();
		x.sub();
		
	}	
	
	
 }	
	