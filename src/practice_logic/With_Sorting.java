package practice_logic;

import java.util.Arrays;

public class With_Sorting 
{
public static void main(String[] args) 
{
	int ar[]= {60,40,30,50,100,10,3,4,6,1};
	for(int i=0;i<=ar.length-1;i++)
	{
		Arrays.sort(ar);
		System.out.print(ar[i]+" ");
		
	}
	System.out.println("\n");
	m1();
}
public static void m1()
{
	int ar[]= {60,40,30,50,100,10,3,4,6,1};
	Arrays.sort(ar);
	System.out.println(ar[0]);
	System.out.println(ar.length);
	System.out.println(ar[ar.length-2]);
}
}
