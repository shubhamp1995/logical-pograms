package Logical_Programs;

public class fibonacci_series 
{
//      a b
//0 1 1 2 3 5 8 13 21 34,55
public static void main(String[] args)
{	
	int a=0, b=1, c;
	
	System.out.print(a+" "+b+" ");
	for(int i=1; i<=11; i++)//1
	{
		c=a+b; 
		System.out.print(c+" ");//1,2,3,5
		//1,
		
		a=b; //b=1, b=2
		b=c; //
	  
		 
}
}
}