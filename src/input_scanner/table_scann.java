package input_scanner;

import java.util.Scanner;

public class table_scann 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter a num: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" x "+i+" = "+num*i);
		}
							
	}
}
