package practice_logic;

import java.util.HashMap;
import java.util.Set;

public class occurance_of_word_within_statement 
{
	public static void main(String[] args) 
	{
		String str="my name is abc is abc my is abc";
		String ar[]=str.split(" ");
		HashMap<String, Integer> map=new HashMap<>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String s1 = ar[i];
			if(map.containsKey(s1))
			{
				map.put(s1, map.get(s1)+1);
			}
			else
			{
				map.put(s1, 1);
			}
			
		}
		Set<String> allkeys = map.keySet();
		for(String keys: allkeys)
		{
			if(map.get(keys)>1)
			{
				System.out.println(keys+"-->"+map.get(keys));
			}
		}
	}
}
