package Logical_Programs;

public class factorial {
public static void main(String[] args) {
	
	m1();
	int num=7;
	int fact=1;
	for(int i=1; i<=num;i++) //1*2*3*4*5=120
	{                           
		fact=fact*i; //1*1=1, 2*1=2,2*3=6, 4*6
	}
	System.out.println("factorial of :"+" "+num+" "+"is"+" "+fact);
}
public static void m1() { //actual way of factorial
	int no=7;
	int fact=1;
	for(int i=no; i>=1;i--) //4*3*2*1=24
	{
		fact=fact*i; //4/12/24 
	}
	System.out.println(fact);
}
}
