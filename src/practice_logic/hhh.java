package practice_logic;

import java.util.HashMap;
import java.util.Set;

public class hhh 
{
public static void main(String[] args)
{
String str="MOZAMBIOUEADOULIEABCZYX";
HashMap<Character, Integer> mp=new HashMap();
for(int i=0; i<=str.length()-1;i++)
{
	if(str.charAt(i)=='A'||str.charAt(i)=='I'||str.charAt(i)=='E'||str.charAt(i)=='U'||str.charAt(i)=='O') 
	{
	char s1=str.charAt(i);	
	if(mp.containsKey(s1))
	{
		mp.put(s1, mp.get(s1)+1);
	}
	else
	{
		mp.put(s1, 1);
	}
	}
}
Set<Character> allkeys = mp.keySet();
for(Character keys:allkeys)
{
	if(mp.get(keys)>1)
	{
		System.out.println(keys+"= "+mp.get(keys));
	}
}
}
}
