package Logical_Programs;

public class Primebased 
//Write a program to check given number is prime or not
//prime number --> a number that is divisible only by 1 or number itself

//exa--> 2,3,5,7,11,13,17,19
{
public static void main(String[] args) {
	int  num=97;
	int count=0;//2
	for(int i=1; i<=100; i++)
	{//1,2,3,4,5,6,7
		if(num % i==0)
		{
			count++;//1,2
		}
	}
	if (count==2)
	{
	System.out.println("prime");
	}
	else
	{
	System.out.println("not prime");
	}
}
}