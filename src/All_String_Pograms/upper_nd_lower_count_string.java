package All_String_Pograms;

public class upper_nd_lower_count_string {
public static void main(String[] args) {
	String s1="AbcacaBada";
	int upper=0,lower=0;
char a;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(ch>='A'&& ch<='Z')
		{
			upper++;
		}
		if(ch>='a'&& ch<='z')
		{
			//lower++;
		}
		if(ch=='a')
		{
			lower++;
		}
	}
	System.out.println("upper case count"+"="+upper);
	System.out.println("lower case count"+"="+lower);
}
}
