package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection 
{
	public void m1()
	{
		List li=new ArrayList();
		
		
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
		Collection a=new Collection();
		a.m1();
	}
}
