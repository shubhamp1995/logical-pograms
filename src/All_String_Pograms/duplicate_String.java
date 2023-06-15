package All_String_Pograms;

public class duplicate_String {
	public static void main(String[] args) {
		String []ar= {"Shubham","gaurav","kumbharsaheb","Shubham","gaurav","abhay"};//10
						//9
		for(int i=0;i<=ar.length-1;i++) //0,1,2,3,4,5,6
		{
							//9
			for(int j=i+1;j<=ar.length-1;j++) //7
			{
				if(ar[i]==ar[j]) //8==8
				{
					System.out.println("duplicate numbers are:"+ar[i]+"");//2,3,8
					
				}
				
			}
			
		
		}
	}
}
