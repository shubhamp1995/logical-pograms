package practice_programs;

import java.util.Arrays;

public class largestnum_in_Arrays 
{
	public static void main(String[] args) 
	{
		int ar[]= {100,1,2,3,4,5,50,10};
		Arrays.sort(ar);
		System.out.println("laregst num is: "+ar[ar.length-1]);
		System.out.println("second largest num is: "+ar[ar.length-2]);
		System.out.println("smallest num is : "+ar[0]);
	}
}
