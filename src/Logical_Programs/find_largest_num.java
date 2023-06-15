package Logical_Programs;

public class find_largest_num 
{
	public static void main(String[] args) {
		
	
int num=12347;
int largest_digit=0;//

for(int i=num;i>0;i=i/10)//1234.7,123,12,1
{
	int rem=num%10;//7,4,3,2,1
	
	if(largest_digit<rem)//0<7,7<4,
	{
		largest_digit=rem;
	}
	
}
System.out.println("largest digit is"+" "+largest_digit);
}
}