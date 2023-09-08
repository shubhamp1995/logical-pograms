package star_pattern;

public class hollw_pyramid
{
public static void main(String[] args) 
{
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 if(j==1||i==5||i==j)
			 {
				 System.out.print("*");
			 }
			 else
			 {
				 System.out.print(" ");
			 }
		 }
		 System.out.println("");
	 }
	 System.out.println("\n");
	 half_hallow_pyramid();
	 System.out.println("\n");
	 hallow_pyramid();
	 System.out.println("\n");
	 m1();
 
}
public static void half_hallow_pyramid() 
{
	int star=1;
	int space=4;
	for(int i=1;i<=5;i++)
	 {
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		 for(int j=1;j<=star;j++)
		 {
			
			if(j==1||j==i||i==5)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		 }
		 System.out.println("");
		 star++;
		 space--;
	 }
}
public static void hallow_pyramid() 
{
	int star=1;
	int space=4;
	for(int i=1;i<=5;i++)
	 {
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		 for(int j=1;j<=star;j++)
		 {
			
			if(j==1||j==i||i==5)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		 }
		 System.out.println("");
		 star++;
		 space--;
	 }
}
public static void m1() 
{
    for(int i=1; i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
          System.out.println(" ");
    }
  
}
}
