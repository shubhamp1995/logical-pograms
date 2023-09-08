package practice_logic;

public class splitStatement_even_odd 
{
public static void main(String []args)
{
	String Str="My name is abc";
	String sr[]=Str.split(" ");
	for(int i=0;i<=sr.length-1;i++)
	{
		String s1=sr[i];
		String rev="";
		if(i%2!=0)
		{
			for(int j=s1.length()-1;j>=0;j--)
			{
				rev+=s1.charAt(j);
			}
			System.out.print(rev+" ");
		}
		else
		{
			System.out.print(s1+" ");
		}
	}
}
}
