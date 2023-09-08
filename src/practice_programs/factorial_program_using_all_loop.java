package practice_programs;

public class factorial_program_using_all_loop
{
	public static void main(String[] args) 
	{
		fact_for();
		System.out.println("===========");
		fact_while();
		System.out.println("===========");
		fact_dowhile();
	}
	public static void fact_for() 
	{
	int num=5;	
	int fact=1;
	for(int i=num;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	}
	public static void fact_while()
	{
	int no=7;
	int fact=1; 		//7,,42,210,840,2520,5040=(5040)
	int i=no;
	while(i>=1)			//7>1,6>1,5>1,4>1,3>1,2>1,1>=1,0>1
	{
		fact=fact*i;	//1*7,7*6,42*5,210*4,840*3,2520*2,5040*1
		i--;
	}
	
	System.out.println(fact);
	}
	public static void fact_dowhile() 
	{
		int num=6;
		int fact=1;
		int i=num;
		do
		{
			fact=fact*i;
			i--;
		}
		while(i>=1);
		System.out.println(fact);
	}
}
