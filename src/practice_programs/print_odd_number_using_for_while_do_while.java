package practice_programs;

public class print_odd_number_using_for_while_do_while 
{
public static void main(String[] args)
{
	for_loop();
	System.out.println("================================");
	while_loop();
	System.out.println("================================");
	do_while();
	
}
public static void for_loop() 
{
	for(int i=1; i<=51;i=i+2)
	{
		System.out.println(i+" >> "+"odd num");
	}
}
public static void while_loop()
{
	int i=1;
	while(i<=51)
	{
		System.out.println(i+" >> "+"odd num");
		i=i+2;
	}
	
}
public static void do_while() 
{
int i=1;
do
{
	System.out.println(i+" >> "+"odd num");
	i=i+2;
}
while(i<=51);

}
}
