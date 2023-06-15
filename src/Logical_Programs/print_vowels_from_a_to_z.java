package Logical_Programs;

public class print_vowels_from_a_to_z {
public static void main(String[] args) {
	for(char i='A';i<='Z';i++)
	{
		if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
		{
			System.out.print(i+" ");
		}
		
	}
}
}
