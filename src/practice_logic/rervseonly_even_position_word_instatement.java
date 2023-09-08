package practice_logic;

public class rervseonly_even_position_word_instatement 
{
public static void main(String[] args) 
{
String str="my name is abc";
String ar[]=str.split(" ");
for(int i=0;i<=ar.length-1;i++)
{
	String org=ar[i];
	String rev="";
	if(i%2!=0)
	{
		for(int j=org.length()-1;j>=0;j--)
		{
			rev=rev+org.charAt(j);
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
