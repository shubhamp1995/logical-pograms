package practice_logic;

import java.util.HashMap;
import java.util.Set;

public class hhhhh 
{
	public static void main(String[] args) {
        String str="gaurav is clever boy";
        char ch[]=str.toCharArray();
	//String ar[]=str.split("");
	HashMap<Character, Integer> mp=new HashMap();

	for(int i=0; i<=ch.length-1;i++)
	{
	    char  s1=ch[i];
	    if(mp.containsKey(s1))
	    {
	        mp.put(s1, mp.get(s1)+1);
	    }
	    else
	    {
	        mp.put(s1,1);
	    }
	}
	Set<Character> allkeys=mp.keySet();
	for(Character keys:allkeys)
	{
	    if(mp.get(keys)>1)
	    {
	        System.out.println(keys+"="+mp.get(keys));
	    }
	}
    }
}
