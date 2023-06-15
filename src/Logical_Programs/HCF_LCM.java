package Logical_Programs;

public class HCF_LCM 
{
public static void main(String[] args) 
{
int a=36;
int b=48;
 int lcm;
 int gcd=0;
 for(int i=1;i<=48;i++)
 {
	 if(a%i==0 && b%i==0)
	 {
		 gcd=i;
	 }
 }
 System.out.println("HCF or GCD  "+a+" and "+b+" is "+gcd);
 lcm=a*b/gcd;
 System.out.println("LCM is "+lcm);
}
}
