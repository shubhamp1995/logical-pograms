package star_pattern;

public class ss {
public static void main(String[] args) {
	for(int i=1; i<=5;i++) //(rows) outer loop
	{
		for(int k=2; k<=i;k++) 
		{
			System.out.print(" "); //spaces 
		}
		for(int j=5; j>=i; j--) // //inner loop //cols(star)
		{
			System.out.print(j+" ");
		
		}				
		System.out.println();
		
	}
}
}
