package star_pattern;

public class HollowPyramid2 
{
public static void main(String[] args) 
{
	m1();
	System.out.println("\n");
	m2();
	System.out.println("\n");
	m3();
}
public static void m1()
{
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		if(j==1 || j==i|| i==5)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println(" ");
}
}
public static void m2() 
{
for(int i=1;i<=5;i++)
{
	for(int k=1;k<=5-i;k++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		if(j==1||j==i||i==5)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println(" ");
}
}
public static void m3() 
{
for(int i=1;i<=5;i++)
{
	for(int k=1;k<=5-i;k++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		if(j==1||j==i||i==5)
		{
			System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
	}
	System.out.println(" ");
}
}
}
