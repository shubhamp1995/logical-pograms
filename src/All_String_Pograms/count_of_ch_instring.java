package All_String_Pograms;

public class count_of_ch_instring {
public static void main(String[] args) {
	String s1="you can achieve anything you want";
	char ch='a';
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		if(s1.charAt(i)==ch)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
