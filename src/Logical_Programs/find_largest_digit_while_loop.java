package Logical_Programs;

public class find_largest_digit_while_loop 
{
public static void main(String[] args) {
	int num=12346;
	int largest_digit=0;
	while(num>0) 
	{
		int rem=num%10;
		if(largest_digit<rem) 
		{
			largest_digit=rem;
		}
		num=num/10;
	}
		System.out.println("largest digit is"+" "+largest_digit);
}
}
