package practice_logic;

public class reverse_number_with_String_function 
{
	public static void main(String[] args) 
	{
		int orgnum=881234564;
		String str = Integer.toString(orgnum);
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		int revnum = Integer.parseInt(rev);
		System.out.println("original num: "+orgnum);
		System.out.println("=======================");
		System.out.println("reverse num: "+revnum);
	}
}
