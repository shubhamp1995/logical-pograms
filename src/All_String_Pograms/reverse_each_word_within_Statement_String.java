package All_String_Pograms;

public class reverse_each_word_within_Statement_String 
{
public static void main(String[] args) 
{
	String Str="my name is xyz";
	String sr[]=Str.split(" ");
	for(int i=0;i<=sr.length-1;i++)
	{
		String org=sr[i];
		String rev="";
		for(int j=org.length()-1;j>=0;j--)
		{
			rev=rev+org.charAt(j);
		}
		System.out.print(rev+" ");
	}
	
}
}
