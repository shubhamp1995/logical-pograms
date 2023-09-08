package input_scanner;

import java.util.Scanner;

public class Scanner_largest_digit 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int largest_digit=0;
		while(num>0)
		{
			int rem=num%10;
			if(largest_digit<rem) 
			{
				largest_digit=rem;
			}
			num=num/10;
		}
		System.out.println("laregst digit is :"+largest_digit);
	}
}
