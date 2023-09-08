package practice_programs;

public class largestdigit_using_forloop 
{
	public static void main(String[] args) 
	{
		int num=862729;
		int largest_digit=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=num%10;
			if(largest_digit<rem)
			{
				largest_digit=rem;
			}
		}
		System.out.println("largest digit is:"+largest_digit);
	}
}
