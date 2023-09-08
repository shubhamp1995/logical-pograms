package star_pattern;

public class star_programs_all_pattern_practice 
{
public static void main(String[] args) 
{
	System.out.println("\n"+" half_pyramid or 1st quadrant"+"\n");
	m1();
	m2();
}
public static void m1()
{
	int star=1;
	int space=16;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		star=star+2;
		space=space-4;
	}
}
public static void m2()
{
	int star=7;
	int space=4;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		star=star-2;
		space=space+4;
	}
}
}
