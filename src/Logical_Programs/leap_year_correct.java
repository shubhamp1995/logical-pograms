package Logical_Programs;

public class leap_year_correct {
public static void main(String[] args) {
	int y=300;
	if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
	{
		System.out.println(y+" "+"is leap year");
	}
	else
	{
		System.out.println(y+" "+"is not a leap year");
	}
}
}
