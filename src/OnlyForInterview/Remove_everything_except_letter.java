package OnlyForInterview;

public class Remove_everything_except_letter 
{
	public static void main(String[] args) 
	{
		String str="abc @ 12 ";
		int countofletter=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char s1 = str.charAt(i);
			if(Character.isLetter(s1))
			{
				countofletter++;
				System.out.print(s1);
			}
		}
		System.out.println("\n"+countofletter);
	}
}
