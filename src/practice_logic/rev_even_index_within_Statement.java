package practice_logic;

public class rev_even_index_within_Statement 
{
	public static void main(String[] args) 
	{
		String str="my name is abc";
		String ar[]=str.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			if(i%2==0) 
			{
			String revString=m1(org);
			System.out.print(revString+" ");
			}
			else
			{
				System.out.print(org+" ");
			}
		}
	}
	public static String m1(String org) 
	{
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev+=org.charAt(i);
		}
		return rev;
	}
}
