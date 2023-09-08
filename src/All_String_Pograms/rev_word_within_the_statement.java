package All_String_Pograms;

public class rev_word_within_the_statement
{
	public static void main(String[] args) 
	{
		String str="my name is abc";
		String ar[]=str.split(" "); //my[0],name[1],is[2],abc[3]
		for(int i=0;i<=ar.length-1;i++)
		{
			String s2=ar[i];
			String rev="";
			for(int j=s2.length()-1;j>=0;j--)
			{
				rev+=s2.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
		
	}
}
