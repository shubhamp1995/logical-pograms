package Logical_Programs;

public class print_table_from_1_to_100 
{
public static void main(String[] args) {
	for(int i=2; i<=10;i++)
	{
		for(int j=1; j<=10;j++)
		{
			System.out.print(" "+j*i+" ");
		}
		System.out.println(" ");
	}
}
}