package practice_logic;

public class reverse_whole_statment 
{
	public static void main(String[] args) 
	{
		String str="my name is abc";
		String sr[]=str.split(" ");
		for(int i=sr.length-1;i>=0;i--)
		{
			System.out.print(sr[i]+" ");
		}
		System.out.println("==========");
		StringBuffer sb=new StringBuffer(str);
	StringBuffer rev = sb.reverse();
	System.out.print(rev+" ");
		
		
	}
}
