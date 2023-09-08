package practice_programs;

public class hcf_lcm_gcd 
{
	public static void main(String[] args) 
	{
		int a=36;
		int b=48;
		int gcd=0;
		int lcm;
		for(int i=1;i<=48;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("hcf of :"+a+" and "+b+" is "+gcd);
		lcm=a*b/gcd;
		System.out.println("lcm is :"+lcm);
	}
}
