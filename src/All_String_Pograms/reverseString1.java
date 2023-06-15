package All_String_Pograms;

public class reverseString1 {
public static void main(String[] args) {
	String name="gaurav"; //0123456
	String rev="";//shubham
	
				//6            0>=0
	for(int i=name.length()-1; i>=0; i--)//6,5,4,3,2,1,0,-1
		
	{
	
		rev=rev+name.charAt(i);//"" +s+h+u+b+h+a+m+
		
	}
	System.out.println("reverse of : "+" "+name+" "+"is"+" "+rev);
	
}
}
