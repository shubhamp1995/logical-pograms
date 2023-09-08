package All_String_Pograms;



public class kalpesh 
{
public static void main(String[] args) 
{
String[]ar= {"basketball", "boll", "basket", "bill","ball"};
String s1=ar[0];
String s2="";
for(int i=1;i<=ar.length-1;i++)
{
	if(s1.contains(ar[i]))
	{
		s2=s2+ar[i];
		
	}
}
System.out.println("first index contains "
		+ "value of other index :"+s2);

if(s1.equals(s2))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
}
}
