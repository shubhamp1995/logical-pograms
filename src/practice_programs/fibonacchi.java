package practice_programs;

public class fibonacchi 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=9;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		System.out.println("\n");
		fibonacchi fibo=new fibonacchi();
		fibo.while_loop();
		
	}
	public void while_loop() 
	{
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		int i=1;
		while(i<=9)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
	
	}
}
