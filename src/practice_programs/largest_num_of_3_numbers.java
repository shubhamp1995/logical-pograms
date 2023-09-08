package practice_programs;

public class largest_num_of_3_numbers 
{
	public static void main(String[] args) 
	{
		int a=30, b=40,c=100;
		if(a>b && a>c)
		{
			System.out.println("largest num is: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("largest num is: "+b);
		}
		else
		{
			System.out.println("largest num is:"+c);
		}
	}
}
