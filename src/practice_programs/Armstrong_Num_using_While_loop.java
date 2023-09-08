package practice_programs;

public class Armstrong_Num_using_While_loop 
{
	public static void main(String[] args) 
	{
		int num=153;
		
		int sum=0;
		int i=num;
		while(i>0)
		{
			int arm=i%10;
			sum+=(arm*arm*arm);
			i=i/10;
		}
		
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println(num+" is armstrong");
		}
		else
		{
			System.err.println(num+" is not armstrong");
		}
	}
}
