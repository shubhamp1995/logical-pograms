package All_String_Pograms;

public class length_ofString_without_space
{
public static void main(String[] args) 
{
	String s1="hello guys";
	System.out.println(s1.length());
	int count=0;
	for(int i=0; i<=s1.length()-1;i++)
	{
		if(s1.charAt(i)!=' ')
		{
			count++;
		}
	}
	System.out.println(count);
}
}
