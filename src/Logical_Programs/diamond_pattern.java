package Logical_Programs;

public class diamond_pattern 
{
public static void main(String[] args) 
{
	int star=1;
	int space=4;
for(int i=1;i<=10;i++)//4
{
	for(int k=1;k<=space;k++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=star;j++)
	{
		System.out.print("* ");
	}
	System.out.println("");
	if(i<5)
	{
		star++;
		space--;
	}
	else if(i==5) 
	{
		
//		space++;
		
	}
	else
	{
		star--;
		space++;
	}
	
}
}
}
