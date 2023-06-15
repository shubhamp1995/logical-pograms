package All_String_Pograms;

import java.util.TreeSet;

public class remove_duplicate_char_from_String
{
public static void main(String[] args) 
{
String s1="abcdefabcdef";
char ch[]=s1.toCharArray();
TreeSet<Character> ts=new TreeSet<Character>();
for(int i=0;i<=ch.length-1;i++)
{
	ts.add(ch[i]);
}
System.out.println(ts);
}
}
