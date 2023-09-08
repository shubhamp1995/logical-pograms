package practice_logic;

public class reversing_splitStatement_allways
{
public static void main(String[]args)
{
	m1();
	System.out.println("\n");
	m2();
	System.out.println("\n");
	m3();
	System.out.println("\n");
	m4();
	
}
public static void m1()
{
	String str="My name is xyz";
	String ar[]=str.split(" ");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
public static void m2()
{
	String str="My name is xyz";
	String ar[]=str.split(" ");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.print(ar[i]+" ");
	}
}
public static void m3()
{
	String str="My name is xyz";
	String ar[]=str.split(" ");
	for(int i=0;i<=ar.length-1;i++)
	{
		
		String s1 = ar[i];
		String rev="";
		for(int j=s1.length()-1;j>=0;j--)
		{
			rev+=s1.charAt(j);
		}
		System.out.print(rev+" ");
	}
}
public static void m4()
{
	String str="My name is xyz";
	String ar[]=str.split(" ");
	for(int i=ar.length-1;i>=0;i--)
	{
		String s1=ar[i];
		String rev="";
		for(int j=s1.length()-1;j>=0;j--)
		{
			rev+=s1.charAt(j);
		}
		System.out.print(rev+" ");
	}
}






















}
