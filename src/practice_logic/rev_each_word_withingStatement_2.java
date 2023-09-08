package practice_logic;

public class rev_each_word_withingStatement_2 
{
	public static void main(String[] args) 
	{
		String str="attitude is everything";
		String sr[]=str.split(" ");
		for(int i=0;i<=sr.length-1;i++)
		{
			String org=sr[i];
			String rev=reverstring(org);
			System.out.print(rev+" ");
		}
		
	}
	public static String reverstring(String org) 
	{
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		return rev;
	}
}
