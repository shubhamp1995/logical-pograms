package All_String_Pograms;

public class print_only_character 
{
	public static void main(String[] args) {
		
		
		String s1="Sh5ubh3a7m";
		int sum=0;
//		System.out.println(s1.charAt(2));
//		System.out.println(s1.charAt(6));
//		System.out.println(s1.charAt(8));
		s1=s1.replaceAll("[^a-zA-Z]","");
		
		//char[]ch=s1.toCharArray();
//		for(int i=0;i<ch.length;i++)//6
//		{
//			//sum=sum+Character.getNumericValue(ch[i]);//2+
//		System.out.println(ch[i]);
//		}
		//System.out.println(sum);
		System.out.print(s1);
}
}