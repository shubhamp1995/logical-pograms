package All_String_Pograms;

import java.util.Arrays;

public class getthenumberfrom_String_and_rev_it

{
	public static void main(String[] args) 
	{
		String s1="shubham231";
		char ch[]=s1.toCharArray();
		
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
			//for(int i=s1.length()-1;i>=0;i--)
		{
			//char character='s';
			//if(s1.charAt(i)!=character)
				if(Character.isDigit(ch[i]))
					rev+=Character.getNumericValue(s1.charAt(i));
				
//			if(Character.isDigit(s1.charAt(i)))
//			rev+=Character.getNumericValue(s1.charAt(i));
		}
		
		System.out.println(rev);
		
//		System.out.println(rev.charAt(2));
//		System.out.println(rev.charAt(1));
//		System.out.println(rev.charAt(0));
	}

}
