package All_String_Pograms;

public class RemoveChraOF_1st_From_2nd 
{
public static void main(String[] args)
{
	String s1="hello World";
	String s2="lWo";
	String result = removeCharFrom1stto2nd(s1,s2);
	System.out.println("result:"+result);
}
public static String removeCharFrom1stto2nd(String s1,String s2)
{
	String result=s1;
	for(int i=0;i<s2.length();i++)
	{
		char c=s2.charAt(i);
		result=result.replace(Character.toString(c),"");
	}
	return result;
}
}
