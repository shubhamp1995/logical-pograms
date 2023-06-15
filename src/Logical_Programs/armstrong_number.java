package Logical_Programs;

public class armstrong_number {
public static void main(String[] args) {
	int num=153;
	int arm=0;//27+125+1
	for(int i=num;i>0;i=i/10)//15,1
	{
		int rem=i%10;//3,5,1
		arm=arm+rem*rem*rem;
	}
	System.out.println(arm);
	if(num==arm)
	{
		System.out.println(num+" "+"armstrong number");
	}
	else
	{
		System.out.println(num+" "+"is not armstrong num");
	}
}
}
