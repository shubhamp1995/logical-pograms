package practice_programs;

public class print_india_Vertically 
{
	public static void main(String[] args) 
	{
		String s1="india";
		s1=s1.toUpperCase();
		System.out.println("original str: "+s1);
		for(int i=0; i<=4;i++)
		{
			System.out.println("\n"+s1.charAt(i));
		}
		
	}
}
