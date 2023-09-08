package practice_programs;

public class largest_digit_using_while_loop 
{
	public static void main(String[] args) 
	{
		int num=81234567;
		int largest_no=0;
		while(num>0)
		{
			int rem=num%10; //7
			if(largest_no<rem)
			{
				largest_no=rem;
			}
			num=num/10;
		}
		
		System.out.println("largest digit is: "+largest_no);
	}
}
