package program;

public class Pattern6 
{
	public static void main(String args[])
	{
		int n=5;
		int k=1;
		
		for(int p=1; p<=n; p++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}
