package star_pattern;

public class horiontal_butterfly {
public static void main(String[] args) {
	int n=10;
	int star=31;
	int Spaces=1;
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=Spaces;k++) {
			System.out.print("  ");
		}
		for(int j=1; j<=star;j++) {
			System.out.print("* ");
		}
		System.out.println("  ");
		star=star-2;
		Spaces++;
	}
	m1();
}
public static void m1() {
	
int n=9;
int star=15;
int Spaces=9;
for(int i=1;i<=n;i++) {
	for(int k=1;k<=Spaces;k++) {
		System.out.print("  ");
	}
	for(int j=1; j<=star;j++) {
		System.out.print("* ");
	}
	System.out.println("  ");
	star=star+2;
	Spaces--;
}
}
}
