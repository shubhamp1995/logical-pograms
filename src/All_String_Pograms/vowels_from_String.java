package All_String_Pograms;

public class vowels_from_String 
{
	public static void main(String[] args) {
			
	
String s1="shubhampetkar";
for(int i=0; i<=s1.length()-1;i++) //2
{
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
	{
		System.out.println(s1.charAt(i));
	}
}
}
}