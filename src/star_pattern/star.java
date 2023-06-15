package star_pattern;

public class star {
public static void main(String[] args) 
	
	{ System.out.println("pyramid"+"\n");
	pattern14(5);
	 System.out.println("\n"+"inverted pyramid"+"\n");
		pattern15(5);
		System.out.println("\n"+"half pyramid"+"\n");
		pattern4(5);
		System.out.println("\n"+"inverted half pyramid"+"\n");
		pattern5(5);
		System.out.println("\n"+"inverted half pyramid"+"\n");
		pattern6(5);
		System.out.println("\n"+"inverted half pyramid(180 deg)"+"\n");
		pattern9(5);
	}
		public static void pattern14(int n) {
		
		for(int i=1; i<=5; i++) // rows       //i=1  spaces =4 star=1
		{									   // i=2 spaces =3 star=2
			for(int k=1; k<=5-i; k++)// space 
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) //column(star)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		}
		public static void pattern15(int n) {
		for(int i=n; i>=1; i--)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		}
	
	public static void pattern4(int n) {
 
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++) 
			{//1 2
				System.out.print("* "); 
			}
		System.out.println("");  		          						
		}
		
	}
	
	public static void pattern5(int n) {
		
		for(int i=n; i>=1; i--) 
		{
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	public static void pattern6(int n) 
	{
	for(int i=1; i<=n; i++) //rows 
	{
		for(int j=n; j>=i; j--) //column 
		{//1 2
			System.out.print("* ");  
		}
	System.out.println(" ");         
	}
	}
	public static void pattern9(int n) 
	{
		for(int i=1; i<=n; i++) 
		{
			for(int k=1; k<=2*n-i*2;k++) 
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
}
}
