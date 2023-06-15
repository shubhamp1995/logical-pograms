package Logical_Programs;

public class prime_num_1_to_100 {
public static void main(String[] args) {
	
	for(int i=2;i<=100;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			break;
		}
		
		//if(i==j)
		{
			System.out.println(i);
		}
	}
}
}
