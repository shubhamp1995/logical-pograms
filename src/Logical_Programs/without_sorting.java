package Logical_Programs;

public class without_sorting {
public static void main(String[] args) {
	//ascending and descending without sorting
	int temp;
	int ar[]= {11,22,33,4,5,2,3};
	for(int i=0;i<ar.length;i++) 
	{
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j]) 
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			
		}
		System.out.println(ar[i]);
	}
	
}
}
