package program;

class Sevenoct 
{
	private class InnerDisplay
	{
		public void m1()
		{
			System.out.println("Private inner class method called");
		}
	}
	void m2()
	{
		System.out.println("Outer class (Display) method called");
		
	InnerDisplay a = new InnerDisplay();
	a.m1();
	}


	
public static void main(String args[])
{
	Sevenoct b=new Sevenoct();
	b.m2();

}
}
