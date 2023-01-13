
// half pyramid

class R21
{
	public static void main(String[]args)
	{
		int i,j,rows=6;
		for(i=1; i<=rows; i++)   // rows
		{
			for(j=rows-i; j>=0; j--)
			{
				System.out.print(" "); // column space
			}
	
			for(j=1; j<=i;j++)
			{
				System.out.print("* "); // print stars columns
				
			}
			System.out.println();
		}
		
	}
}	