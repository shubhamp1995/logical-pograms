package practice_programs;


public class print_evenNum_1_to_12_using_all_loop 
{
public static void main(String[] args) 
{
	p1();
	System.out.println("=================================");
	p2();
	System.out.println("=================================");
	p3();
}
public static void p1()
{
for(int i=1;i<=12;i++)
{
	if(i%2==0)
	{
		System.out.println(i+" >> "+"is even num");
	}
}
}
public static void p2()
{
int i=1;
while(i<=12)
{
	if(i%2==0)
	{
		System.out.println(i+" >> "+"is even num");
		
	}
	i++;
	
}
}
public static void p3() 
{
	int i=1;
	do
	{
		if(i%2==0)
		{
			System.out.println(i+" >> "+"is even num");
			
		}
		i++;
	}
	while(i<=12);
	
}
}
