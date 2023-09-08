package practice_logic;

public class Split_using_for_and_While 
{
public static void main(String[]args)
{
	String str="My name is abc";
	String sr[]=str.split(" ");
	for(int i=0;i<=sr.length-1;i++)
	{
		System.out.print(sr[i]+" ");
	}
	System.out.println("=============");
	m1();
}
public static void m1()
{
	String s1="kya bolte public";
	String ar[]=s1.split(" ");
	int i=0;
	while(i<=ar.length-1)
	{
		System.out.print(ar[i]+" ");
		i++;
	}
}
}
