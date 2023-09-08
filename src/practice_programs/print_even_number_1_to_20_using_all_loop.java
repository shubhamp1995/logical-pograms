package practice_programs;

public class print_even_number_1_to_20_using_all_loop 
{
public static void main(String[] args) 
{
	m1();
	System.out.println("====================");
	m2();
	System.out.println("====================");
	print_even_number_1_to_20_using_all_loop even=new print_even_number_1_to_20_using_all_loop();
	even.m3();
}
public static  void m1()
{
for(int i=2;i<=20;i=i+2)	
{
	System.out.println(i);
}
}
public static void m2()
{
int i=2;
while(i<=20)
{
	System.out.println(i);
	i=i+2;
}
}
public void m3()
{
int i=2;
do
{
	System.out.println(i);
	i=i+2;
}
while(i<=20);
}
}
