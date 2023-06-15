package Logical_Programs;

public class duplicatenumber_inarrays {
public static void main(String[] args) {
	int []ar= {1,2,3,4,2,7,8,8,3,9,9};//10
					//9
	for(int i=0;i<=ar.length-1;i++) //0,1,2,3,4,5,6
	{
						//9
		for(int j=i+1;j<=ar.length-1;j++) //7
		{
			if(ar[i]==ar[j]) //8==8
			{
				System.out.println("duplicate numbers are:"+ar[i]+",");//2,3,8
				
			}
			
		}
		
	
	}
}
}
