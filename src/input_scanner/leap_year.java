package input_scanner;

import java.util.Scanner;

public class leap_year 
{
	
	public static void main(String[] args) {
		int y;
		System.out.println("enter a year");
	Scanner sc =new Scanner(System.in);
		y=sc.nextInt();
		if(y%100==0 && y%400==0||y%100!=0&&y%4==0)
		{
			System.out.println(y+" "+"is a leap year");
		}
		else
		{
			System.out.println(y+" "+"is not a leap year");
		}
	}
	

}
