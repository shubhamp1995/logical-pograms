package Logical_Programs;

public class numberswapping_first_logic {
public static void main(String[] args) {
	int x=20;
	int y=40;
	System.out.println("before swapping"+" x="+x+" "+"y="+y);
	x=x+y; //60
	y=x-y;   //60-40=20
	x=x-y;  //60-20=40
	System.out.println("-----------------------------------");
	System.out.println("after swapping"+" x="+x+" "+" y="+y);

}
}
