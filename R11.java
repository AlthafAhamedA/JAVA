import java.util.*;
class R11
{
public static void main(String[]args)
{
	Scanner S = new Scanner(System.in);
	System.out.println("Enter the value of m1:");
	int m1 = S.nextInt();
	System.out.println("Enter the value of m1:");
	int m2 = S.nextInt();
	System.out.println("Enter the value of m1:");
	int m3 = S.nextInt();
	R11 x = new R11();
	x.total(m1, m2,m3);
	R12.mul(1);
	
	
}

	 void total(int m1, int m2, int m3)
	{
		
		int total=m1+m2+m3;
		System.out.println("Total is :" +total);
		
		R12 r = new R12();   //object must
		int z = r.avg(total); // non static method is referenced from static main method m1, m2, m3 
		System.out.println("The average :"+z);
		
		
		
		
	}	
}	