package practice_logic;

public class Ascending_descending_without_sorting 
{
public static void main(String[] args) 
{
	int temp;
int ar[]= {60,40,30,50,100,10,3,4,6,1};
for(int i=0;i<=ar.length-1;i++)
{
	for(int j=i+1;j<=ar.length-1;j++)
	{
		if(ar[i]>ar[j])
		{
		   temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
	}
	System.out.print(ar[i]+" ");
}
}
}
