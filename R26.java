//inheritance 

class A
{
	int a =10;
}

class B extends A
{
		int b =15;
		
}
class C
{
	B x = new B();
	int c = x.b+x.a;
}

class D extends C
{
	int d = 10;
	int total = c + d;

}	

class R26
{
public static void main(String[]args)
{
	
D y = new D();
int E = y.total;
System.out.println(E);	
	
	
	
}	
	
}	