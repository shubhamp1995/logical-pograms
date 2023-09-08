package practice_logic;

public class revrse_Statement_using_method_returnType 
{
public static void main(String []args)
{
	String Str="My name is abc";
	String sr[]=Str.split(" ");
	for(int i=0;i<=sr.length-1;i++)
	{
		String org=sr[i];
		String rev=reverseString(org);
		System.out.print(rev+" ");
	}
}
public static String reverseString(String org)
{
	String rev="";
	for(int i=org.length()-1;i>=0;i--)
	{
		rev+=org.charAt(i);
	}
	return rev;
	
}
}
