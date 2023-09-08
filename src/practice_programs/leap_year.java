package practice_programs;

public class leap_year 
{
	public static void main(String[] args)
	{
		int year=2007;
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not leap year");
		}
	}
}
