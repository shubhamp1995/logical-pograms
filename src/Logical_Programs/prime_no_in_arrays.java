package Logical_Programs;

public class prime_no_in_arrays 
{//prime num is divisible by 1 or num itself 
public static void main(String[] args) {
	int ar[]= {2,3,4,1,6,5,7,8,10};
	
	for(int i=0;i<=ar.length-1;i++)//i=0=2,1,2,3
	{
		
		int count=0;			 
		for(int j=1;j<=ar[i];j++)//1<=3,2<=3,3<=3,4<=3 ar[0],ar[1]
		{
			if(ar[i]%j==0)//3%1==0,3%2=1,3%3==0
			{
				count++;//
			}
		}
		if(count==2)
		{
			System.out.println(ar[i]+" "+"is prime no");
		}
		else
		{
			System.out.println(ar[i]+" "+"is not a prime no");
		}
	}
	
		
}

}

