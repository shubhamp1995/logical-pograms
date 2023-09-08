package All_String_Pograms;

public class rev_word_within_statement 
{
	public static void main(String[] args) 
	{
		String str="ms dhoni is legend";
		String ar[]=str.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			String rev=reverstring(org);
			System.out.print(rev+" ");
		}
		
	}
	
	
	
	public static String reverstring(String org)
	{
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev+=org.charAt(i);
		}
		return rev;
	}
}
