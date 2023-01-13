class A
{
static int a =10;	
	
}	

class B
{

int b =20;

}	


class R5
{
	public static void main(String[]args)
	{
	int x =10;
	B y = new B();
	A z = new A();
	
	int c = A.a + y.b + x;   //static variable in different class can be called by Class Name no need to create object. 
	int d = z.a;             //object creation also works.
	System.out.println(c);
	System.out.println(d);
	}

}



	