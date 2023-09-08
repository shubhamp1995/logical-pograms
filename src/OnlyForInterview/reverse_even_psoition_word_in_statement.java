package OnlyForInterview;

public class reverse_even_psoition_word_in_statement 
{
public static void main(String[] args) 
{
String Str="My name is abc";
String sr[]=Str.split(" ");
for(int i=0;i<=sr.length-1;i++)
{
	String org = sr[i];
	String rev="";
	if(i%2!=0)
	{
		for(int j=org.length()-1;j>=0;j--)
		{
			rev+=org.charAt(j);
			
		}
		System.out.print(rev+" ");
	}
	else
	{
		System.out.print(org+" ");
	}
}
}
}
