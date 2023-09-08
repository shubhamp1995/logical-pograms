package practice_logic;

public class reverse_number 
{
	public static void main(String[] args) 
	{
		int num=412345;
		int rev=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		System.out.println("================");
		m1();
	}
	
	public static void m1()
	{
		int no=9876543;
		int rev=0;
		while(no>0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		System.out.println(rev);
	}
}
