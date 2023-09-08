package OnlyForInterview;

public class Stribuffer 
{
public static void main(String[] args)
{
	String str="xyz abc";
StringBuffer sb=new StringBuffer(str);	
System.out.println(sb);

StringBuffer rev = sb.reverse();
System.out.print(rev+" ");
}
}
