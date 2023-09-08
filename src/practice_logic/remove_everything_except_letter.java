package practice_logic;

public class remove_everything_except_letter 
{
	public static void main(String[] args) 
	{
		String Str="abcd 12 @ ";
		int countletter=0;
		String str2="";
		String rev="";
		for(int i=0;i<=Str.length()-1;i++)
		{
			char s1 = Str.charAt(i);
			if(Character.isLetter(s1))
			{
				
				countletter++;
				System.out.print(s1+" ");
				str2=str2+s1;	
			}
			
		}
		System.out.println("\n");
		for(int j=str2.length()-1;j>=0;j--)
		{
			 rev=rev+" "+str2.charAt(j);
			
		}
		
		System.out.print(rev+" ");
//		for(int j=Str.length()-1;j>=0;j--)
//		{
//			char s2 = Str.charAt(j);
//			if(Character.isLetter(s2))
//			{
//				countletter++;
//				System.out.print(s2+" ");
//			}
//		}
		 
		System.out.println("\n"+"count of letter :"+countletter);
	}
}
