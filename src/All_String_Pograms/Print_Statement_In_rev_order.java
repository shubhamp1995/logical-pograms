package All_String_Pograms;

public class Print_Statement_In_rev_order 
{
	public static void main(String[] args) 
	{
		String str="my name is shubham";
		String s2[]=str.split(" "); //my[1],name[2],is[3],shubham[4]
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.print(s2[i]+" ");
		}
		
	}
}
