package All_String_Pograms;

import java.util.Arrays;

public class Anagrams_String {
public static void main(String[] args) {
	String s1="LISTEN";//blue
	String s4=new String("red");
	String s5=new String ("orange");//listen -->s1,s3
	String s3="LISTEN";//blue
	String s2="SILENT";//red								//silent -->s2
	int a=10;
	int b=10;
	 
	System.out.println(a==b);
	System.out.println("-----------------");
	System.out.println(s1.equals(s3));//use to compare address//true
	System.out.println(s1==s2);//false
	System.out.println(s4==s2);//false
	System.out.println("----------");
	char ch1 []=s1.toCharArray();
	char ch2 []=s2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	boolean result = Arrays.equals(ch1, ch2);//use to compare values present in object
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
