package input_scanner;

import java.util.Scanner;

public class largest_of_3_numbers 
{
public static void main(String[] args) {//
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first num");
	int a=sc.nextInt();
	
	System.out.println("Enter a second num");
	int b=sc.nextInt();
	
	System.out.println("Enter a third num");
	int c=sc.nextInt();
	
	if(a>b&&a>c)
	{
		System.out.println(a+" is largest num");
	}
	else if(b>c&&b>a)
	{
		System.out.println(b+" is largest num");
	}
	else
	{
		System.out.println(c+" is largest num");
	}
	
}
}
