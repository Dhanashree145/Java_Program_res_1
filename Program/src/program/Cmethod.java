package program;

public class Cmethod extends Bmethod
{
	public void m5()
	{
	super.m3();
	super.m4();
}

	public static void main(String [] args)
	{
		Cmethod z=new Cmethod();
		z.m5();
	}
	}