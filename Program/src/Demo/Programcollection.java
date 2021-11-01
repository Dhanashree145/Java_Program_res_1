package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programcollection 
{
	public void m1()
	{
		List li=new ArrayList();
		li.add(5);
		li.add(2);
		li.add(3);
		li.add(7);
		
		li.add("Dhanu");
		
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
	}
	public static void main(String[]args)
	{
		Programcollection a=new Programcollection();
		a.m1();
	}
}


