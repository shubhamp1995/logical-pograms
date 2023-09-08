package practice_programs;

public class palindrome_number
{
	public static void main(String[] args) 
	{
		int num=212;
		int rev=0;				//2+21+212
		for(int i=num;i>0;i=i/10)//212,21,2
		{
			int rem=i%10; 		//2,1,2
			rev=rev*10+rem; 	//2,21,210+2=212
		}
		System.out.println("original num is: "+num);
		System.out.println("======================");
		System.out.println("reverse num is : "+rev);
		if(num==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}
}
