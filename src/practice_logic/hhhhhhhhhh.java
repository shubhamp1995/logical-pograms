package practice_logic;

import java.util.HashMap;
import java.util.Set;

public class hhhhhhhhhh 
{
	public static void main(String[] args) {
        String str="gaurav is clever booy 34221";
        char ch[]=str.toCharArray();
	//String ar[]=str.split("");
	HashMap<Character, Integer> mp=new HashMap();

	for(int i=0; i<=ch.length-1;i++)
	{
//	    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
//	    {
	    	char s1=ch[i];
	  
	    if(Character.isLetter(s1))
	    {
	    	if(mp.containsKey(s1))
		    {
		        mp.put(s1, mp.get(s1)+1);
		    }
		    else
		    {
		        mp.put(s1,1);
		    }
	    }
	    else
	    {
	    	if(mp.containsKey(s1))
		    {
		        mp.put(s1, mp.get(s1)+1);
		    }
		    else
		    {
		        mp.put(s1,1);
		    }
	    }
//	    }
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
