package Logical_Programs;

public class palindromeno {
	public static void main(String args[])

	{

	int no=131;
	int temp=no;//131
	int rev=0,rem;
	while(temp> 0)
	{
	rem=temp%10;//2,3,1
	rev=rev*10+rem; //231
	temp=temp/10; //13,1
	}
	System.out.println(rev);
	if(no==rev)
	{
	System.out.println(no+" is palindrome number");
	}
	else
	{
		System.out.println(no+" is not a palidrome number");
	}
	}
}
