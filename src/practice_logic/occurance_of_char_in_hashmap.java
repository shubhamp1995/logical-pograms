package practice_logic;

import java.util.HashMap;
import java.util.Set;

public class occurance_of_char_in_hashmap 
{
	public static void main(String[] args) 
	{
		String str="abcabzb";
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<=str.length()-1;i++)
		{
			 char s1 = str.charAt(i);
			if(map.containsKey(s1))
			{
				map.put(s1, map.get(s1)+1);
			}
			else
			{
				map.put(s1, 1);
			}
		}
		Set<Character> allkeys = map.keySet();
		for(Character keys:allkeys)
		{
			System.out.println(keys);
		}
		for(Character keys:allkeys)
		{
			System.out.println(keys+"-->"+map.get(keys));
		} 
		System.out.println("====================");
		//print only duplicate char
		
		for(Character keys:allkeys)
		{
			if(map.get(keys)>1)
				//if(map.get(keys)==1)
			{
				System.out.println(keys+"-->"+map.get(keys));
			}
		}
	}
}
