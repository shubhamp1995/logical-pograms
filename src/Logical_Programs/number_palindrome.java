package Logical_Programs;

public class number_palindrome {
 
	public static void main(String []args) {
		
		int num=2002;
		int revnum=0;
		for(int i=num;i>0;i=i/10) 
		{
		int rem=i%10;
		revnum=revnum*10+rem;
				
		
	}
		System.out.println("org number:"+num);
		System.out.println("-----------------------");
	    System.out.println(revnum);
if(num==revnum) {
	System.out.println("number is palindrome");
}
else
{
	System.out.println("number is not palindorme ");
}
	}
	
}
