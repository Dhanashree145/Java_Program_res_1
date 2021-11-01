package program;

public class Boverloading extends Aoverloading
{
	public void m1(int c)
	{
		System.out.println(c);
	}
	public static void main(String args[])
	{
	Boverloading A=new Boverloading();
	A.m1(100);
}
}
