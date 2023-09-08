package number_pattern;

public class numberpatern 
{
public static void main(String[] args) 
{
int num=1;
int star=1;
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=star;j++,num++)
	{
		System.out.print(num+" ");
//		num++;
	}
	System.out.println(" ");
	star++;
}
System.out.println("\n");
m1();
System.out.println("\n");
m3();
}
public static void m1()
{
	int num=1;
for(int i=1;i<=5;i++)
{
	for(int k=1;k<=5-i;k++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++,num++)
	{
		System.out.print(num+" ");
	}
	System.out.println(" ");
}
}
public static void m3()
{
for(int i=1;i<=5;i++)
{
	for(int j=5;j>=i;j--)
	{
		System.out.print(j+" ");
	}
	System.out.println(" ");
}
}
}
