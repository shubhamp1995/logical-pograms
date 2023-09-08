package OnlyForInterview;

public class StarPattern2 
{
public static void main(String[] args) 
{
	int count=2;
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=count;j--)
		{
			System.out.print(j);
			
		}
		count++;
		System.out.print("*");
		System.out.println("");
	}
	System.out.println("\n");
	m1();
	System.out.println("\n");
	m2();
}
public static void m1()
{
	int count=4;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=count;j++)
		{
			System.out.print(j);
		}
		count--;
		System.out.print("*");
		System.out.println("");
	}
	
}
public static void m2()
{
	int count=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=1;j--)
		{
			if(j==count)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(j);
			}
		}
		count++;
		System.out.println("");
	}
	
}
}
