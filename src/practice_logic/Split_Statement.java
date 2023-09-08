package practice_logic;

public class Split_Statement 
{
	public static void main(String[] args) 
	{
		String str="my name is abc";
		String [] s1=str.split(" ");
		System.out.println(s1[3]);
		
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.print(s1[i]+" ");
		}
	}


}
