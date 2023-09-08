package number_pattern;

public class number {
	public static void main(String[] args) {
		System.out.println("half pyramid with number"+"\n");
		pattern7(5);
		System.out.println("\n"+"inverted half pyramid with number"+"\n");
		pattern8(5);
		System.out.println("\n"+"inverted half pyramid with number(180 deg)"+"\n");
		pattern10(5);
		System.out.println("\n"+"number pyramid");
		pattern12(5);
		System.out.println("\n"+"number palnidromic pattern");
		pattern13(5);
		
	}
	public static void pattern7(int n) {
		for(int i=1; i<=n; i++) //3
		{ 
			for(int j=1; j<=i;j++)//1
			{
				System.out.print(j+" ");
				
				
			}
			System.out.println(" ");
		}
		
	}
	public static void pattern8(int n) {
			for(int i=n; i>=1; i--) //rows 
			{
				for(int j=1; j<=i; j++) //column 
				{//1 2
					System.out.print(j+" ");   
					                          
				}                             
			                                  
			System.out.println(" ");        
			}
	}
	public static void pattern10(int n) 
	{
		for(int i=1; i<=n; i++) 
		{
			for(int k=1; k<=n-i;k++) 
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) 
			{
				System.out.print(j);
			}
			System.out.println(" ");
			
		}
	}
	public static void pattern12(int n) 
	{
		for(int i=1; i<=n; i++) 
		{
			for(int k=1; k<=n-i;k++) 
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}
	public static void pattern13(int n) 
	{
		for(int i=1; i<=n; i++) //outer loop2
		{
			for(int k=1; k<=n-i;k++) 
			{
				System.out.print(" ");
			}
			// first half
			for(int j=i; j>=1;j--) 
			{
				System.out.print(j);
			}
			//2nd half
			for(int j=2; j<=i;j++) 
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
