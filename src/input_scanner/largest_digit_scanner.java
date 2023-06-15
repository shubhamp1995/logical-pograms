package input_scanner;

import java.util.Scanner;

public class largest_digit_scanner 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a num");
int num=sc.nextInt();
int largestnum=0;
while(num>0)
{
	int rem=num%10;
	if(largestnum<rem)
	{
		largestnum=rem;
	}
	num=num/10;
	
	
}
System.out.println("largest digit is "+" "+largestnum);




}
}
