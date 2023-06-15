package All_String_Pograms;

import java.util.Arrays;

public class Anagrams_String {
public static void main(String[] args) {
	String s1="LISTEN";
	String s2="SILENTs";
	
	char ch1 []=s1.toCharArray();
	char ch2 []=s2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	boolean result = Arrays.equals(ch1, ch2);
	if(result)
	{
		System.out.println(s1+" and "+s2+" Are Anagrams");
	}
	else
	{
		
		System.out.println(s1+" and "+s2+" Are  not Anagrams");
		
	}
}
}
