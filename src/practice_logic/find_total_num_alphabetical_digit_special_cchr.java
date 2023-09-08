package practice_logic;

public class find_total_num_alphabetical_digit_special_cchr 
{
	public static void main(String[] args)
	{
		String Str="abc 12 @!";
		int countDigit=0;
		int countSpcchr=0;
		int countletter=0;
		int whitesapce=0;
		
		for(int i=0;i<=Str.length()-1;i++)
		{
			char s1 = Str.charAt(i);
			if(Character.isLetter(s1))
			{
				countletter++;
			}
			else if(Character.isDigit(s1))
			{
				countDigit++;
			}
			else if(Character.isWhitespace(s1))
			{
				whitesapce++;
			}
			else
			{
				countSpcchr++;
			}
			
		}
		System.out.println(countDigit);
		System.out.println(countletter);
		System.out.println(whitesapce);
		System.out.println(countSpcchr);

	

	
	}
}
