package program;

public class Father extends Mother
{
public void m3()
{
	System.out.println("Method C");
}
public static void main(String args[])
{
	Father c=new Father();
	c.m1();
	c.m2();
	c.m3();
	
}
}
