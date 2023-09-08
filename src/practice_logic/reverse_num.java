package practice_logic;

public class reverse_num 
{
public static void main(String[] args) 
{
int num=312345;
String str = Integer.toString(num);
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
	rev+=str.charAt(i);
}
int revnum = Integer.parseInt(rev);
System.out.println(revnum);
}
}
