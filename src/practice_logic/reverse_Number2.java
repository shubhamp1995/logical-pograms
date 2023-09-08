package practice_logic;

public class reverse_Number2 
{
	public static void main(String[] args) {
		
	
int num=12345;
int rev=0;
for(int i=num;i>0;i=i/10)
{
	int rem=i%10;
	rev=rev*10+rem;
}

System.out.println(rev);
m1();
}
	public static void m1()
	{
		int num=54321;
		int rev=0;
		int i=num;
		while(i>0)
		{
			int rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
		System.out.println(rev);
	}
}