package program;

public class Cc extends Bb
{
int a=50;
int b=60;
int c=5;

public void m3()
{
	System.out.println("M3---C");
}
public void m4()
{
	System.out.println("M4---C");
}
public static void main(String args[])
{
	Bb a=new Cc();
	a.m3();
}
}
