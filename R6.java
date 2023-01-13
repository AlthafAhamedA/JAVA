class Student
{
	String name1, name2;
	int m1,m2,m3,m4,m5,y1,y2,y3,y4,y5;
}

class calc
{
	int total, total2;
	float avg, avg2;
}	


class R6
{
	public static void main(String[]args)
	{
		Student x = new Student();
		x.name1="Althaf";
		x.name2="Ahamed";
		x.m1=10;
		x.m2=20;
		x.m3=30;
		x.m4=40;
		x.m5=50;
		x.y1=60;
		x.y2=70;
		x.y3=80;
		x.y4=90;
		x.y5=100;
		calc c = new calc();
		c.total = x.m1+x.m2+x.m3+x.m4+x.m5;
		c.total2= x.y1+x.y2+x.y3+x.y4+x.y5;
		c.avg = c.total/5f;
		c.avg2 = c.total/5f;
	
	System.out.println("Student name:" +x.name1 +"Total marks:"+ c.total +"Average"+ c.avg); 
	System.out.println("Student name:" +x.name2 +"Total marks:"+ c.total2 +"Average"+ c.avg2); 
	}
	
	
	
	
}	
		
		