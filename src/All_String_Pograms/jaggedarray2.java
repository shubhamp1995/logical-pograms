package All_String_Pograms;

public class jaggedarray2 

{
public static void main(String[] args)
{
int arr [][]=new int[3][];
arr [0]=new int [4];
arr[1]=new int[3];
arr[2]=new int[2];


int count=0;
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0; j<=arr[i].length-1;j++)
	{
		arr[i][j]=count++;
		System.out.print(arr[i][j]+" ");
	}
	System.out.println(" ");
	count=0;
}

}
}
