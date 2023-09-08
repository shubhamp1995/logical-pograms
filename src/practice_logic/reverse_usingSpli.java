package practice_logic;

import java.util.Arrays;

public class reverse_usingSpli 
{
public static void main(String[]args)
{
	String str="dbchada";
	String ar[]=str.split("");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.print(ar[i]);
	}
	System.out.println("\n");
	m1();
}
//print the string alphabetically
public static void m1()
{
	String s1="dbca";
	String sr[]=s1.split("");
	Arrays.sort(sr);
	System.out.println(Arrays.toString(sr));
	for(int i=0;i<=sr.length-1;i++)
	{
		System.out.print(sr[i]);
	}
	
}
}
