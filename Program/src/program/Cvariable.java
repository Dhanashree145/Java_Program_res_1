package program;

public class Cvariable extends Bvariable
{
	int a=30;
	public void m2()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String []args)
	{
		Bvariable j=new Bvariable();
		j.m1();
		
		Cvariable m=new Cvariable();
		m.m2();
	}
}

