package star_pattern;

public class all_star_pattern {
public static void main(String[] args) {
	p1();
	System.out.println("\n");
	p1_1();
	System.out.println("\n");
	p2();
	System.out.println("\n");
	p2_2();
	System.out.println("\n");
	p3();
	System.out.println("\n");
	p16();
	System.out.println("\n");
	p4();
	System.out.println("\n");
	p15();
	System.out.println("\n");
	p5();
	System.out.println("\n");
	p6();
	System.out.println("\n");
	p7();
	System.out.println("\n");
	p8();
	System.out.println("\n");
	p9();
	System.out.println("\n");
	p10();
	System.out.println("\n");
	p11();
	System.out.println("\n");
	p12();
	System.out.println("\n");
	p13();
	System.out.println("\n");
	p14();
}
public static void p1() 
{
	int star=1;
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println("");
		star++;
	}
}
public static void p1_1() 
{
	int star=1;
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=star;j++) {
			System.out.print("* ");
		}
		System.out.println("");
		star++;
	}
}
public static void p2() {
	int star=5;
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=star;j++) {
			System.out.print("*");
			
			
		}
		System.out.println("");
		star--;
	}
}
public static void p2_2() {
	int star=5;
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=star;j++) {
			System.out.print("* ");
		}
		System.out.println("");
		star--;
	}
}
public static void p3() {

int star=1;
int spaces=4;
for(int i=1;i<=5;i++) 
{
	for(int k=1; k<=spaces;k++) {
		System.out.print(" ");
	}
	for(int j=1;j<=star;j++) {
		System.out.print("*");
	}
	System.out.println("");
	star++;
	spaces--;
}
}
public static void p16() {

int star=1;
int spaces=8;
for(int i=1;i<=5;i++) 
{
	for(int k=1; k<=spaces;k++) {
		System.out.print(" ");
	}
	for(int j=1;j<=star;j++) {
		System.out.print("* ");
	}
	System.out.println("");
	star++;
	spaces=spaces-2;
}
}
public static void p4() {
	int star=5;
	int spaces=0;
	for(int i=1;i<=5;i++) 
	{
		for(int k=1; k<=spaces;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println("");
		star--;
		spaces++;
}
}
public static void p15() {
	int star=5;
	int spaces=0;
	for(int i=1;i<=5;i++) 
	{
		for(int k=1; k<=spaces;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("* ");
		}
		System.out.println("");
		star--;
		spaces=spaces+2;
}
}
public static void p5() 
{
	int star=1;
	int spaces=4;
	for(int i=1;i<=5;i++) 
	{
		for(int k=1; k<=spaces;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println("");
		star=star+2;
		spaces--;
	
}
}
public static void p6() 
{
	int star=9;
	int spaces=0;
	for(int i=1;i<=5;i++) 
	{
		for(int k=1; k<=spaces;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println("");
		star=star-2;
		spaces++;
	}
}
	public static void p7() 
	{
		int star=1;
		int spaces=4;
		for(int i=1;i<=9;i++) 
		{
			for(int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println("");
			if(i<=4) {
				star=star+2;
				spaces--;
			}
			else {
				star=star-2;
				spaces++;
			}
		
	}
}
	public static void p8() 
	{
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
				
	}
		for(int i=4;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
}
	public static void p9() 
	{
		int star=1;
		int spaces=4;
		for(int i=1;i<=9;i++) 
		{
			for(int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println("");
			if(i<=4) {
				star++;
				spaces--;
			}
			else {
				star--;
				spaces++;
			}
		
	}
}
	public static void p10() 
	{
		int spaces=4;
		for(int i=1;i<=5;i++) 
		{
			for(int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
			spaces--;
		
	}
	}
	public static void p11() 
	{
		int spaces=0;
		for(int i=1;i<=5;i++) 
		{
			for(int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
			spaces++;
		
	}
	}
	public static void p12() 
	{
		int star=5;
		
		for(int i=1;i<=9;i++) 
		{
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println("");
			if(i<=4) {
				star--;
				
			}
			else {
				star++;
			
			}
		
	}
}
	public static void p13() 
	{
		int star=5;
		int spaces=0;
		for(int i=1;i<=9;i++) 
		{
			for(int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println("");
			if(i<=4) {
				star--;
				spaces++;
			}
			else {
				star++;
				spaces--;
			}
		
	}
}
	public static void p14() 
	{
		int star=5;
		int spaces=0;
		for(int i=1;i<=5;i++) //5
		{
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println("");
			star--;
			spaces=spaces+2;
	}
		m1();
	}
		public static void m1() 
		{
			int star=1;
			int spaces=8;
		for(int i=1;i<=5;i++) //5
		{
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println("");
			star++;
			spaces=spaces-2;
	}

}
}