package practice_logic;

public class ArmStrong_Number 
{
public static void main(String[] args) 
{
	int num=153;
	int sum=0;
	for(int i=num;i>0;i=i/10)
	{
		int arm=i%10;
		sum+=(arm*arm*arm);
	}
	System.out.println("orginal: "+num);
	if (num==sum)
	{
		System.out.println("given num "+num+" is armstrong number");
	}
	else
	{
		System.err.println("given num "+num+" is not armstrong number");
	}
}
}
