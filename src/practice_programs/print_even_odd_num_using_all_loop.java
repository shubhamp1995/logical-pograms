package practice_programs;

public class print_even_odd_num_using_all_loop 
{
	public static void main(String[] args) 
	{
			m11();
			System.out.println("====================");
			m12();
			System.out.println("======================");
			m13();
	}
	
	public static void m11() 
	{
		for(int i=1;i<=21;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" >> "+" is even num");
			}
			else
			{
				System.out.println(i+" >> "+" is odd num");
			}
		}
		
	}
	
	public static void m12() 
	{
	int i=1;
	while(i<=21)
	{
		if(i%2==0)
		{
			System.out.println(i+" >> "+" is even num");
		}
		else
		{
			System.out.println(i+" >> "+" is odd num");
		}
		i++;
	}
	}
	public static void m13() 
	{
		int i=1;
		do 
		{
			if(i%2==0)
			{
				System.out.println(i+" >> "+" is even num");
			}
			else
			{
				System.out.println(i+" >> "+" is odd num");
			}
			i++;
		}
		while(i<=21);
	}
	
}
