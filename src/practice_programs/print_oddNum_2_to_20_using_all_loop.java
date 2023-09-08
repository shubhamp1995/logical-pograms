package practice_programs;

public class print_oddNum_2_to_20_using_all_loop 
{
	public static void main(String[] args) 
	{
		p11();
		System.out.println("====================");
		p12();
		System.out.println("====================");
		p13();
	}
public static void p11()
	{
	for (int i = 2; i<=20; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" >> "+"is odd num");
			}
		}	
	}
	public static void p12()
	{
		int i=2;
		while(i<=20)
		{
			if(i%2!=0)
			{
				System.out.println(i+" >> "+"is odd num");
			}
			i++;
		}
	}
	public static void p13() 
	{
		int i=2;
		do
		{
			if(i%2!=0)
			{
				System.out.println(i+" >> "+"is odd num");
			}
			i++;
		}
		while(i<=20);
		
	}
}
