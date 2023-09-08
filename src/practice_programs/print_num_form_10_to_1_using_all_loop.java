package practice_programs;

public class print_num_form_10_to_1_using_all_loop 
{
public void m1() 
{
for(int i=10;i>=1;i--)
{
	System.out.println(i);
}
}
public void M2() 
{
int i=10;
while(i>=1)
{
	System.out.println(i);
	i--;
}
}
public void M3()
{
int i=10;
do
{
	System.out.println(i);
	i--;
}
while(i>=1);
}
public static void main(String[] args) 
{
	print_num_form_10_to_1_using_all_loop s1=new print_num_form_10_to_1_using_all_loop();
	s1.m1();
	System.out.println("====================");
	s1.M2();
	System.out.println("====================");
	s1.M3();
}
}
