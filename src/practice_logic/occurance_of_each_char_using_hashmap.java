package practice_logic;

import java.util.HashMap;
import java.util.Set;

public class occurance_of_each_char_using_hashmap 
{
	public static void main(String[] args) 
	{
		String str="xyzxyabybca";
		HashMap<Character, Integer> mp=new HashMap<>();
		for(int i=0;i<=str.length()-1;i++)
		{
			char s1 = str.charAt(i);
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
		}
		Set<Character> allkeys = mp.keySet();
		for(Object keys:allkeys)
		{
			if(mp.get(keys)>1)
			{
				System.out.println(keys+" ->"+mp.get(keys));
			}
		}
	}
}
