class B
{
	int a =10, b=15;
}

class R3
{
public static void main(String[]args)
{
B x = new B();
int c = x.a+x.b;
System.out.println(c);	
	
C y = new C();  // calling from another class variable
int d = y.d + x.a+x.b;
System.out.println(d);	
	
	
}	
}





class C
{
	
int d =15;
	
}	