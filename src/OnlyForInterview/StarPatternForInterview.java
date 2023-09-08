package OnlyForInterview;

public class StarPatternForInterview 
{
	public static void main(String[] args) 
	{
	int count=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=5; j>=1;j--)
		{
			if(j==count)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(j);
			}
		}
		count++;
		System.out.println("");
	}
	}
}
