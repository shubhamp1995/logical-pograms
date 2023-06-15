package star_pattern;

public class horizontal_star_pattern {
public static void main(String[] args) {
	int star=1;
	int spaces=5;
	// first half
	for(int i=1; i<=10; i++)//2
	{
		for(int j=9; j>=i; j--)
		{
			System.out.print("   ");
		}
		for(int k=1; k<=star; k++)
		{
			System.out.print(" * ");
			
		}
		System.out.println("");
	
		star=star+2;//3
	}
	m1();
	
}
//2nd half 
public static void m1() {
	int star=17;
	int spaces=1;

for (int i = 1;i<=9; i++) {
	for(int j=1;j<=spaces;j++) {
		System.out.print("   ");
	}
	for(int k=1; k<=star;k++) {
		System.out.print(" * ");
	}
	System.out.println("");
	star=star-2;
	spaces++;
}
	
}
}

