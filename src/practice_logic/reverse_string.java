package practice_logic;

public class reverse_string 
{
	public static void main(String[] args) {
		
	
String str="shubham";
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
	rev+=str.charAt(i);
}
System.out.println(rev);
}
}