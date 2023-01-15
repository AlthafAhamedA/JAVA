class R7                 // Dyanmmic object  calls variable parent only but methods sub class.
{

int b=100;
void m1()
{
	System.out.println("Hello");
}

}
class R6 extends R7
{		
int b=15;
void m1()
{
	System.out.println("Hello11111");
}
}
class R4 
	{
		public static void main(String[] args) {
		R7 r=new R6();
		r.m1();
		System.out.println(r.b);
		
			
			
			
		}
		
		
		
	}


