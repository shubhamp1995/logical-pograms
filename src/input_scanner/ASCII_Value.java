package input_scanner;

import java.util.Scanner;

public class ASCII_Value {
public static void main(String[] args) {
	//print ascii value of character
	char ch;//'A'
	System.out.println("Enter any character");
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(0);
	int numvalue=ch;
	System.out.println("ASCII Value OF"+" "+ch+" "+"is"+"="+numvalue);
	
}
}
