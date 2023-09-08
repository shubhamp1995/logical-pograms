package input_scanner;

import java.util.Scanner;

public class Accept_Input_From_String 
{
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter a num: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		//System.out.println("addition of number is:"+(num+num));
		System.out.println("Enter a num2: ");
		int num2=sc.nextInt();
		System.out.println("addition of num and num2: "+(num+num2));
	}
}
