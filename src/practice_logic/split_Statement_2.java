package practice_logic;

public class split_Statement_2 
{
	public static void main(String[] args)
	{ 
		String str="my name is abc";
		String []ar=str.split(" ");
		System.out.println(ar[3]);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println(" ");
		m1();
	}
	
	public static void m1() 
	{
		String str="my name is shubham";
		String ar[]=str.split(" ");
		int i=0;
		while(i<=ar.length-1)
		{
			System.out.print(ar[i]+" ");
			i++;
		}
	}
}
