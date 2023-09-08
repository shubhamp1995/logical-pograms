package practice_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap_programs 
{
	public static void main(String[] args) 
	{
		HashMap<String, Float> mp=new HashMap<>();
		mp.put("suresh", 98f);
		mp.put("Shubham", 98.43f);
		mp.put("mahesh", 54.23f);
		mp.put("kalpesh", null);
		System.out.println(mp);
		
		//to update
		mp.put("Shubham", 99f);
		System.out.println(mp);
		
		//to verify key is present or not
		System.out.println(mp.containsKey("kalpesh"));//true
		
		//to get value of specifi key
		System.out.println(mp.get("mahesh"));
		
		//to get all keys
		Set<String> allkeys = mp.keySet();
		for(String key:allkeys)
		{
			System.out.println(key);
		}
		for(String key:allkeys)
		{
			System.out.println(key+"= "+mp.get(key));
		}
		System.out.println("=================");
		Iterator<Entry<String, Float>> itr = mp.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String, Float> opt = itr.next();
			System.out.println(opt);
		}
		System.out.println("=================");
		System.out.println(mp.size());
		System.out.println("=================");
		for(int i=0;i<=mp.size()-1;i++)
		{
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
