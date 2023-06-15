package All_String_Pograms;

public class Addition_of_num_in_String_exa2
{
public static void main(String[] args) 
{
	String s1="10value8with20value6470";
String count="";
int sum=0;
char[]s2=s1.toCharArray();
for(int i=0;i<=s2.length-1;i++)
{
	if(Character.isDigit(s2[i]))
	{
		count +=s2[i];//stored in count in form of char
		sum+=Integer.parseInt(count);//covert string to int and add it to sum
		count="0";
	}
}
System.out.println(sum);
}
}
