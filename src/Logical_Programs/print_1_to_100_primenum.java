package Logical_Programs;

public class print_1_to_100_primenum {

	public static void main(String[] args) {
		
		
		for(int i=2; i<=100;i++)//
		{
			
			int count=0;//1
			for(int j=2;j<i;j++)//2<1
			{
				if(i%j==0)
				{
					count++;//
				}
				
			}
			if(count==0)//1==0
			{
				System.out.println(i+" prime no ");
			}
			
		}
		
	}
}
