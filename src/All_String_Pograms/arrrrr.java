package All_String_Pograms;

public class arrrrr
{
public static void main(String[] args)
{
	String s1="10value8with20value6470";
	String s2="";
	char[]s3=s1.toCharArray();
	for(int i=0;i<=s3.length-1;i++)
	{
		if(Character.isDigit(s3[i]))
		{
			s2+=s3[i];
		}
		else
		{
			char[]s4=s2.toCharArray();
			for(int j=s4.length-1;j>=0;j--)
			{
				System.out.print(s4[i]);
			}
			System.out.print(" ");
			s2="";
		}
			
		
	}
}
}
