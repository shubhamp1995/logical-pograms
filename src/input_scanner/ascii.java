package input_scanner;

import java.util.Scanner;

public class ascii 
{
	public static void main(String[] args) 
	{
	char ch;
	System.out.println("Enter any character: ");
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(0);
	int numvalue=ch;
	System.out.println("Ascii value of char :"+ch+" is "+ numvalue);
	}
}
