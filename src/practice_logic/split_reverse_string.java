package practice_logic;

public class split_reverse_string 
{
public static void main(String[] args) 
{
String Str="abcd";
String ar[]=Str.split("");

System.out.println(ar.length);
System.out.println(ar[ar.length-1]);
for(int i=ar.length-1;i>=0;i--)
{
	System.out.print(ar[i]+" ");
}

}
}
