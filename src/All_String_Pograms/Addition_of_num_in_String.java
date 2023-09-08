package All_String_Pograms;

public class Addition_of_num_in_String
{
public static void main(String[] args) 
{
	String s1="10value8with20value6470";
	s1=s1.replaceAll("[a-z,A-Z]", "");
	System.out.println(s1+" ");
	int temp=0;
	char[]s2=s1.toCharArray();
	for(int i=0;i<=s2.length-1;i++)
	{
		temp+=Character.getNumericValue(s2[i]);
	}
	System.out.println(temp);
	
}
}
