package program;

public class Mother extends Child
{
public void m2()
{
	System.out.println("Method B");
}
public static void main (String args[])
{
	Mother b=new Mother();
	b.m1();
	b.m2();
}
}
