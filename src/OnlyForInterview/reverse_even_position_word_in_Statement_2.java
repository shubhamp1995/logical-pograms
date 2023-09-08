package OnlyForInterview;

public class reverse_even_position_word_in_Statement_2 
{
	public static void main(String[] args)
	{
		String str="my name is abc";
		String sr[]=str.split(" ");
		for(int i=0;i<=sr.length-1;i++)
		{
			String org=sr[i];
			if(i%2==0)
			{
				String rev = ReverseString(org);
				System.out.print(rev+" ");
			}
			else
			{
				System.out.print(org+" ");
			}
			
		}
	}
	
	
	public static String ReverseString(String org)
	{
		String rev="";
	for(int i=org.length()-1;i>=0;i--)
	{
		rev+=org.charAt(i);
	}
	return rev;
	}
}
