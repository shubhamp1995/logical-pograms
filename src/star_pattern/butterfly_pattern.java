package star_pattern;

public class butterfly_pattern {
public static void main(String[] args) {
	int n=10;
	int star=1;
	int spaces=18;
	for(int i=1; i<=n;i++) //1
	{
		for(int j=1; j<=star;j++) 
		{
			System.out.print("*");
		}
		for(int k=1;k<=spaces;k++) 
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star; j++) 
		{
			System.out.print("*");
		}
		System.out.println("");
		star++;
		spaces=spaces-2;
	}
	m1();
}
public static void m1() {
	int n=9;
	int star=9;
	int spaces=2;
	
	for(int i=n; i>=1;i--) {
		for(int j=1;j<=star;j++) 
		{
			System.out.print("*");
		}
		for(int k=1;k<=spaces;k++) 
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) 
		{
			System.out.print("*");
		}
		System.out.println("");
		star--;
		spaces=spaces+2;
	}
}
}
