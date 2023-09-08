package input_scanner;

import java.util.Scanner;

public class String_scanner 
{
	public static void main(String[] args)
	{
		String s1;
		System.out.println("enter a String: ");
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		System.out.println(s1.toUpperCase());
	}
}
