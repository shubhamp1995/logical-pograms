package OnlyForInterview;



public class Split_statement 
{
	public static void main(String[] args) 
	{
		String str="my name is abc";
		String[] sr = str.split(" ");
		for(int i=0;i<=sr.length-1;i++)
		{
			System.out.print(sr[i]+" ");
		}
		System.out.println("\n");
		m1();
	}
public static void m1()
{
	String str="my name is abc";
	String[] sr = str.split(" ");
	int i=0;
	while(i<=sr.length-1)
	{
		System.out.print(sr[i]+" ");
		i++;
	}
}

}
