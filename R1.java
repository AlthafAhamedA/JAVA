// super keywords - non static methods mattum use panna mudiyum


class  A
{
	int a = 10;
	int b = 20;

}


class R1 extends A
{

	public static void main(String[]args)
	{
		R1 x = new R1();
		x.add();
	}	

	void add()
	{
		int c = super.a + super.b;
		System.out.println(c);

	}


}	