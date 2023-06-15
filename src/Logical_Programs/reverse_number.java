package Logical_Programs;

public class reverse_number {
	// WAP to reverse a given number 
		public static void main(String []args) {
			
			int num=987654321;
			int revnum=0;
			for(int i=num;i>0;i=i/10) 
			{
			int rem=i%10;
			revnum=revnum*10+rem;
		}
			System.out.println(num);
			System.out.println("-----------------------");
		System.out.println(revnum);
}
}