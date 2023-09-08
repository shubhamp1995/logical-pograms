package practice_programs;

public class lcm_hcf 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=15;
		int gcd=0;
		int lcm;
		int i=1;
		while(i<=15)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
			i++;
		}
		System.out.println("hcf of :"+a+" and "+b+" is "+gcd);
		lcm=a*b/gcd;
		System.out.println("lcm is:"+lcm);
	}
}
