package All_String_Pograms;

import java.util.Arrays;

public class anagram_String {
public static void main(String[] args) 
{
String s1="peeks";
String S2="keep";

	if(isAnagrams(s1, S2))
	{
		System.out.println(s1+ " and "+S2+" "+"are anagrams");
	}
	else
	{
		System.out.println(s1+ " and "+S2+" "+"are not anagrams");
	}
} 

public static Boolean isAnagrams(String s1,String S2)
{
	if(s1.length()!=S2.length())
	{
		return false;
	}
	else
	{
		char ch1 []=s1.toCharArray();
		char ch2[] =S2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}	
}
}
