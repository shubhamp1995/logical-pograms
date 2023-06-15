package practice_logic;

public class duplicate_number {
public static void main(String[] args) {
	int []a= {1,2,3,4,1,5,1,3,6,4,8};
	for(int i=0; i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[j]);
			}
		}
	}
}
}
