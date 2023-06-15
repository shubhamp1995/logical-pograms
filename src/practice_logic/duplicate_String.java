package practice_logic;

import java.util.Arrays;

public class duplicate_String {
public static void main(String[] args) {
	String s1[]=new String[6];
	s1[0]="shubham";
	s1[1]="gaurav";
	s1[2]="akash";
	s1[3]="shubham";
	s1[4]="akash";
	s1[5]="swapnil";

	System.out.println(s1.length);
	for(int i=0; i<=s1.length-1;i++)
	{
		System.out.println(s1[i]);
	}
	System.out.println("-------------------");
	System.out.println(Arrays.toString(s1));
	for(int i=0;i<=s1.length-1;i++)
	{
		for(int j=i+1;j<=s1.length-1;j++)
		{
			if(s1[i].equals(s1[j]))
			{
				System.out.println(s1[i]);
			}
		}
	}
	
}
}
