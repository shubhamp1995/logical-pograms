package input_scanner;

import java.util.Scanner;

public class three_num_largest 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a first num: ");
int a=sc.nextInt();
System.out.println("Enter a second num: ");
int b=sc.nextInt();
System.out.println("Enter a third num: ");
int c=sc.nextInt();

if(a>b && a>c)
{
	System.out.println(a+" is largest");
}
else if(b>a && b>c)
{
	System.out.println(b+" is largest");
}
else
{
	System.out.println(c+" is largest");
}
	
	}
}
