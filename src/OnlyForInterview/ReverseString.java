package OnlyForInterview;

public class ReverseString 
{
public static void main(String[] args) 
{
String str="hello World";
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
	rev+=str.charAt(i);
}
System.out.println(rev);
System.out.println("\n");
give2nd_to_1st();
}
public static void give2nd_to_1st()
{
String str="hello world";
String rev="";
String[] str2 = str.split(" ");
for(int i=str2.length-1;i>=0;i--)
{
//	System.out.print(str2[i]+" ");
	rev=rev+" "+str2[i];
}
System.out.println(rev+" ");
}
}
