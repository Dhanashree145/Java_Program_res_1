package program;

public class Demothree extends Demotwo
{
	char M='m';
	char N='n';
	char O='o';
public void m5()
{
	String m="chaitali";
	String n="Saish";
	String o="chaitali";
	 
	System.out.println(n);
}
public void m6()
{
	
	int j=10;
	int k=6;
	int l=j*k;
	
	System.out.println(l);
}

	public static void main(String args[])
	{
		Demoone g=new Demothree();
		g.m1();
		g.m2();
		System.out.println(g.a);
		System.out.println(g.b);
		
		Demotwo z=new Demothree();
		z.m3();
		System.out.println(z.y);
		
		Demothree r=new Demothree();
		r.m5();
		r.m6();
		System.out.println(r.M);
		System.out.println(r.N);
	
	}
}
