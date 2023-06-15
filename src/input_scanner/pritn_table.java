package input_scanner;

import java.util.Scanner;

public class pritn_table 
{
	public static void main(String[] args)
	{
		int num;
		System.out.print("enter any number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+" "+num*i);
		}
	}
}
