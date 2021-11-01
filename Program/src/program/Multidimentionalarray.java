package program;

public class Multidimentionalarray 
{
	public void m1()
	{
		int a[][]=new int [3][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		int b[][]=new int[3][3];
		b[0][0]=5;
		b[0][1]=10;
		b[1][0]=15;
		b[1][1]=20;
		
		int c=a[0][2]+b[0][1];
		int d=a[0][1]*b[1][1];
		int e=a[0][2]/b[0][0];
		int f=a[0][0]-b[1][0];
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
	public static void main(String[] args)
	{
	Multidimentionalarray a=new Multidimentionalarray();
	a.m1();
	}
	}

