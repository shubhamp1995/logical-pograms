package All_String_Pograms;



public class addition_of_number_from_String
{
public static void main(String[] args) {
	String s1="Sh5ubh3a7m";
	int sum=0;//15
	for(int i=0; i<=s1.length()-1;i++)//10
	{
		if(Character.isDigit(s1.charAt(i)))
		{
			sum=sum+Character.getNumericValue(s1.charAt(i));//5+3=8+7=15
			//System.out.println(s1.charAt(i));
		}
	}
	System.out.println(sum);
	

	
}
}
