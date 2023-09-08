package practice_logic;

import java.util.HashMap;
import java.util.Set;

public class hashmap_programs 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<>();
		
		//1.put--> to add values and keys into hashmap
		map.put(101, "shubham");
		map.put(102, "rahul");
		map.put(103, "sanket");
		map.put(104, "gaurav");
		map.put(null, null);
		System.out.println(map);
		
		//2. to update key and values in hashmap
		map.put(null, "tushar");
		System.out.println(map);
		
		//3.containskey-->to verifiy if spcific key value is present or not
		System.out.println(map.containsKey(103));
		
		//4.getkayvalue-->to get the key value from hashmap
		System.out.println(map.get(101));
		
		//5.keyset-->to get all keys from hashmap
		Set<Integer> allkeys = map.keySet();
		for(Integer s1:allkeys)
		{
			System.out.println(s1);
		}
		
		//6.keyset-->to get all keys and values present in hashmap
		for(Integer s1:allkeys)
		{
			System.out.println(s1+"--"+map.get(s1));
		}
		
		
		
		
		
		
		
		
		
	}
}
