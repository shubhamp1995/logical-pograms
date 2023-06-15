package Logical_Programs;

public class exa14 {

public void m1() {
	for(int i=1; i<=100; i++) 
	{
		if(i%2!=0) {
			System.out.println(i+" "+"is odd num"+"\n"+"--------");
			
		}
		
		else
		{
			System.out.println(i+" "+"is even num"+"\n"+"---------");
		}
	}
}


public static void main(String[] args) {
	exa14 e4=new exa14();
	e4.m1();
}
}
