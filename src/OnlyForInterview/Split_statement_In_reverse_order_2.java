

package OnlyForInterview;

public class Split_statement_In_reverse_order_2 
{
	public static void main(String[] args)
	{
		String str="my name is abc";
		String sr[]=str.split(" ");
		for(int i=0;i<=sr.length-1;i++)
		{
			String org=sr[i];
			String rev = ReverseString(org);
			System.out.print(rev+" ");
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
