package All_String_Pograms;

public class print_only_character_in_String

{
public static void main(String[] args)
{
String s1="10value8with20value6470";
s1=s1.replaceAll("[0-9]", "");
System.out.println(s1);

char[]s2=s1.toCharArray();
for(int i=0; i<=s2.length-1;i++)
{
	System.out.print(s2[i]+" ");
}
}
}
