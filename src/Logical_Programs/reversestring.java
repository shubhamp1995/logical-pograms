package Logical_Programs;

public class reversestring {
	int a=20;
	 reversestring(){
		 a=40;
		 
	 }
	 String h;
public static void main(String[] args) {
	 //public int n=20; //can't declare any specifires within methods to local varibale
	reversestring b1=new reversestring();
	System.out.println(b1.a);
	System.out.println(b1.h);
	String s1="uhh";//num
	s1=s1+"shuhham2";
	String str="dad"; //4   0123 //mom/dad/madam/NAMAN
	String rev="";//
	int length=str.length(); //length=4
	for(int i=length-1; i>=0;i--)//
	{
		rev=rev+str.charAt(i);//""+
	}
	System.out.println("orginal:"+str);
	
	if(str.equals(rev)) 
	{
		System.out.println("given String is palindrome");
	}
else
{
	System.out.println("given String is not palindrome");
}
}
}
//String variable.length() // length of string
// charAt(i); // position of char of word 