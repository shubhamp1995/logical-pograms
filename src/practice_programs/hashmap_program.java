package practice_programs;

import java.util.HashMap;
import java.util.Set;

public class hashmap_program 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mp=new HashMap<>();
		
		//1.put(k,v)-->to add key and values in hashmap
		mp.put(101, "ramesh");
		mp.put(102, "sagar");
		mp.put(103, "akash");
		mp.put(null, null);
		mp.put(null, null);
		System.out.println(mp);
		
		//2. put(k,v)-->to update values in already existing key
		mp.put(null, "SHUBHAM");
		System.out.println(mp);
		
		//3.getkey-->to get value of specific key
		System.out.println(mp.get(103));
		
		//4. containskey-->to verify the key present or not
		System.out.println(mp.containsKey(102));//true
		
		//5.keyset-->to get all keys from hashmap
		Set<Integer> allkeys = mp.keySet();
		for(Integer s1:allkeys)
		{
			System.out.println(s1);
		}
		
		//6.to get all keys and values
		for(Integer s1:allkeys)
		{
			System.out.println(s1+"= "+mp.get(s1));
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
