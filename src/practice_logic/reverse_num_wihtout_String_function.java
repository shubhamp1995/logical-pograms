package practice_logic;

public class reverse_num_wihtout_String_function
{
	public static void main(String[] args)
	{
		int num=512345;
		int rev=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
			
		}
		System.out.println(rev);
	}
}
