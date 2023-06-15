package All_String_Pograms;

public class palindrome_string {
	public static void main(String[] args) {
		
	
	String str="NAMAN"; //mom/dad/madam/NAMAN
	String rev="";//
	 
	for(int i=str.length()-1; i>=0;i--)//
	{
		rev=rev+str.charAt(i);//""+
	}
	System.out.println("orginal:"+str);
	
	if(str.equals(rev)) 
	{
		System.out.println("given String is palindrome");
	}
else
{
	System.out.println("given String is not palindrome");
}
}
}


