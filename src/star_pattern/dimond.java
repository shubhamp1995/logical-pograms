package star_pattern;

public class dimond {
	

public static void main(String[] args) {
	for(int i=1; i<=10; i++)//1
	{
		for(int j=9; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print(" *");
		}
		System.out.println("");
	}
	// reverse pyramid
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=10-i; k++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
}
}