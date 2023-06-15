package Logical_Programs;

public class prime_number {
public static void main(String[] args) {
	int num=7;
	int count=0;
	for(int i=1;i<=10;i++) 
	{
		if(num%i==0)
		{
			count++;//1,2
		}
	}
	if(count==2)
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println("not prime");
	}
		
}
}
