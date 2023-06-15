package All_String_Pograms;

//print only the reverse number  

public class print_num_in_reverse_order_from_String 
{
public static void main(String[] args) 
{
String s1="10Value8with20value6470";
String count="";

char []s2=s1.toCharArray();
for(int i=s2.length-1;i>=0;i--)
{
	if(Character.isDigit(s2[i]))
	{
		count+=s2[i];
		
	}
}
System.out.println(count+" ");
}
}
