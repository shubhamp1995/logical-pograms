package input_scanner;

import java.util.Scanner;

public class leap_year_scanner 
{
	public static void main(String[] args)
	{
		int y;
		System.out.println("Enter a year: ");
		Scanner sc=new Scanner(System.in);
		y=sc.nextInt();
		if(y%400==0 && y%100==0 || y%4==0 && y%100!=0)
		{
			System.out.println(y+" is leap year ");
		}
		else
		{
			System.err.println(y+" is not a leap year");
		}
	}
}
