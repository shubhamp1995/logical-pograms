package star_pattern;

public class demo1 {
public static void main(String[] args) {
	//half pyramid // 1st quadrant
	int star=1;
	
	for(int i=1;i<=5;i++)//1,2,3,4,5,6//outer for loop//rows//imp 
	{
		for(int j=1;j<=star;j++) //1,2,3,4,5,6//inner for loop//cols/star
		{
			System.out.print("* ");
		}
		System.out.println(" ");//compiler will jump onto next line 
		star++;//6
	}
	System.out.println("-----------------");
	m1();
	System.out.println("---------------------");
	m2();
	System.out.println("---------------------");
	m3();
	System.out.println("---------------------");
	m4();
	m5();
	System.out.println("----------------");
	m6();
	System.out.println("----------------");
	m7();
	System.out.println("----------------");
	m8();
	m9();
	
	
	
	
}
public static void m1() {
	
int star=5;
for(int i=1;i<=5;i++) //
{
	for(int j=1;j<=star;j++) //1,2
	{
		System.out.print("* ");
	}
	System.out.println("");
	star--;//0
}

}
public static void m2() {
	int star=1;
	int spaces=8;

for(int i=1;i<=5;i++) //1,2outer loop//rows
{
for(int k=1; k<=spaces;k++ ) //1,2,3,,5spaces
{
	System.out.print(" ");
}
	
	for(int j=1;j<=star;j++) //1,2//inner //clos
	{
		System.out.print("* ");
	}
	System.out.println("");
	spaces=spaces-2;
	star++;
	
}
}
public static void m3() {
	int star=5;
	int spaces=0;

for(int i=1;i<=5;i++) //1,2outer loop//rows
{
for(int k=1; k<=spaces;k++ ) //1,2,3,,5spaces
{
	System.out.print(" ");
}
	
	for(int j=1;j<=star;j++) //1,2//inner //clos
	{
		System.out.print("* ");
	}
	System.out.println("");
	spaces=spaces+2;
	star--;
	
}
}
public static void m4() {
	int star=1;
	int spaces=4;

for(int i=1;i<=5;i++) //1,2outer loop//rows
{
	for(int k=1; k<=spaces;k++ ) //1,2,3,,5spaces
	{
		System.out.print(" ");
	}
		for(int j=1;j<=star;j++) //1,2//inner //clos
		{
			System.out.print("* ");
		}
		System.out.println("");
		spaces--;
		star++;
	
}
}
public static void m5() 
{
	int star=4;
	int spaces=1;

for(int i=1;i<=4;i++) //1,2outer loop//rows
{
	for(int k=1; k<=spaces;k++ ) //1,2,3,,5spaces
	{
		System.out.print(" ");
	}
		for(int j=1;j<=star;j++) //1,2//inner //clos
		{
			System.out.print("* ");
		}
		System.out.println("");
		spaces++;
		star--;
	
}
}
public static void m6() 
{
	
	int spaces=4;

for(int i=1;i<=5;i++) //1,2outer loop//rows
{
	for(int k=1; k<=spaces;k++ ) //1,2,3,,5spaces
	{
		System.out.print(" ");
	}
		for(int j=1;j<=5;j++) //1,2//inner //clos
		{
			System.out.print("*");
		}
		System.out.println("");
		spaces--;
		
	
}
}
public static void m7() 
{
	
	int spaces=0;

for(int i=1;i<=5;i++) //1,2outer loop//rows
{
	for(int k=1; k<=spaces;k++ ) //1,2,3,,5spaces
	{
		System.out.print(" ");
	}
		for(int j=1;j<=5;j++) //1,2//inner //clos
		{
			System.out.print("*");
		}
		System.out.println("");
		spaces++;
		
	
}
}
public static void m8() 
{
	int star=5;
	int spaces=0;
for(int i=1;i<=5;i++) //1,2,outer loop//rows
{
		for(int j=1;j<=star;j++) //1,2//inner //clos
		{
			System.out.print("*");
		}
		for(int k=1; k<=spaces;k++ ) //1,2,3,,5spaces
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) //1,2//inner //clos
		{
			System.out.print("*");
		}
		System.out.println("");
		star--;
		spaces=spaces+2;
		
		
		
	
}
}
public static void m9() 
{
	int star=1;
	int spaces=8;
for(int i=1;i<=5;i++) //1,2,outer loop//rows
{
		for(int j=1;j<=star;j++) //1,2//inner //clos
		{
			System.out.print("*");
		}
		for(int k=1; k<=spaces;k++ ) //1,2,3,,5spaces
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) //1,2//inner //clos
		{
			System.out.print("*");
		}
		System.out.println("");
		star++;
		spaces=spaces-2;
		
		
		
	
}
}
}