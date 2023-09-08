package OnlyForInterview;

public class Split_Statement_In_Reverse_Order 
{
	public static void main(String[] args) 
	{
		m3();
		System.out.println("\n");
		m0();
		System.out.println("\n");
		m2();
		System.out.println("\n");
		m1();
		
	}
	public static void m0()
	{
		String str="My name is dhoni";

		String ar[]=str.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}






public static void m2()
{
	String str="My name is dhoni";

	String ar[]=str.split(" ");
	for(int i=0;i<=ar.length-1;i++)
	{
		String org = ar[i];
		String rev="";
		for(int j=org.length()-1;j>=0;j--)
		{
			rev=rev+org.charAt(j);
		}
		System.out.print(rev+" ");
	}
}
public static void m1() 
{
	String str="My name is dhoni";

	String ar[]=str.split(" ");
for(int i=ar.length-1;i>=0;i--)
{
	String org=ar[i];
	String rev="";
	for(int j=org.length()-1;j>=0;j--)
	{
		rev+=org.charAt(j);
	}
	System.out.print(rev+" ");
}
	
}
public static void m3()
{
	String str="My name is dhoni";

	String ar[]=str.split(" ");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
}
