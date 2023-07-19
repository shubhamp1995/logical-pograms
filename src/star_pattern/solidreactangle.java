
package star_pattern;

public class solidreactangle {
public static void main(String[] args) {
	System.out.println("solid rectangle"+"\n");
	pattern1(5);
	System.out.println("\n"+"with 4 rows"+"\n");
	pattern2();
	System.out.println("\n"+"hollow ractangle"+"\n");
	pattern3();
	}
public static void pattern1(int n) {
	for(int i=1; i<=n; i++) //rows=i outer for loop
	{
		for(int j=1; j<=n;j++ ) //61column=j * inner looop
		{
			System.out.print("* ");
		}
		System.out.println("");
	}
}
public static void pattern2() {
	int r=4;
	int c=5;
	for(int i=1;i<=r;i++) {
		for (int j = 1; j<=c; j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
	}
}
public static void pattern3() {
	int r=4;
	int c=9;
	for(int i=1;i<=r;i++) {
		for (int j = 1; j<=c; j++) 
		{
			if((i==1 || j==1)||i==r||j==c) {
				System.out.print("* ");
			}
			else {
				System.out.print(" ");
			}
			
		}
		System.out.println(" ");
	}
}
}
