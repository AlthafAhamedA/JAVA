import java.util.*;
class R31
{
	static String Lname=" ";
	static String Lpass=" ";
	static String Rname=" ";
	static String Rpass=" ";
	static String Rcpass=" ";
	
	public static void main(String[]args)
	{
		System.out.println("Enter 1.Login \n 2.Register"); 
		Scanner S = new Scanner(System.in);	
		int a = S.nextInt();
		
		if(a==1)
		{
			login();	
		}	
		
		else if (a==2)
		{
			Register();
		}
		
		else
		{
			System.out.println("Enter the valid ");
		}
		
	}
	
	static void login()
	{
		
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the Login Name");
		Lname = S1.next(); 
		System.out.println("Enter the Login Password");
		Lpass = S1.next();
		
		if(Lname.equals(Rname) && Lpass.equals(Rpass))
		{	
			System.out.println("Success");
		
		}	
		
		else
		{	
			System.out.println("Failed");
				
		}	
		
	}

	static void Register()
	{
		Scanner S3 = new Scanner(System.in);
		System.out.println("Enter the Register Name");
		Rname=S3.next();
		System.out.println("Enter the Register Password");
		Rpass=S3.next();
		System.out.println("Enter the Confirm Password");
		Rcpass=S3.next();
		
		if(Rpass.equals(Rcpass))
		{	
		System.out.println("Registration Success");
		login();
		}
		
	}	
	
	
}	