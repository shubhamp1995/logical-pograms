package All_String_Pograms;

public class Reverse_String_With_Same_position1 
{
public static void main(String[] args) {
	String a="dhoni is a good batsman";
	System.out.println(a.length());
	String b[]=a.split(" ");
	
	System.out.println(b.length);
	for(int i=0;i<=b.length-1;i++)
	{
		String c[]=b[i].split("");
		String d="";
		for(int j=c.length-1;j>=0;j--)
		{
			d=d+c[j];
		}
		System.out.print(d+" ");
	}
	
}
}
