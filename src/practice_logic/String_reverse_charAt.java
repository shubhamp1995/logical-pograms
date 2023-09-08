package practice_logic;

public class String_reverse_charAt 
{
public static void main(String[] args) 
{
String str="abcd";
String rev="";
System.out.println(str.length());
for(int i=str.length()-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
System.out.println(rev+" ");
}
}
