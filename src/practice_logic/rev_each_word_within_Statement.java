package practice_logic;

public class rev_each_word_within_Statement 
{
	public static void main(String[] args) 
	{
		String str="dhoni is a good batsman";
		String ar[]=str.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			String rev="";
			for(int j=org.length()-1;j>=0;j--)
			{
				rev=rev+org.charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}
