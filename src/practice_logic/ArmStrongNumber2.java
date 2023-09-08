package practice_logic;

public class ArmStrongNumber2 
{
public static void main(String[] args) 
{
int num=153;
int rev=0;
for(int i=num; i>0;i=i/10)
{
	int arm=i%10;
	rev=rev+arm*arm*arm;
	
}
System.out.println(rev);
if(num==rev)
{
	System.out.println("number is ArmStrong");
}
else
{
	System.out.println("number is not Armstrong");
}
}
}
