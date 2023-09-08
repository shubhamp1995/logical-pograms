package All_String_Pograms;

public class Reverse_number_using_string 
{
	public static void main(String[] args) 
	{
		int num=1234;
		String s1=Integer.toString(num);
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev+=s1.charAt(i);
		}
		int s2=Integer.parseInt(rev);
		System.out.println(rev+" ");
	}
}
