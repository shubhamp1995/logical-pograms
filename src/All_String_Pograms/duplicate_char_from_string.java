package All_String_Pograms;

public class duplicate_char_from_string {

	public static void main(String[] args) {
		String s1="shuhmbham";
//		String s2[]=s1.split(" ");
		char[]ch=s1.toCharArray();
		int count =0;
		for(int i=0;i<=ch.length-1;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++) 
			{
				if(ch[i]==ch[j]) {
					
					System.out.println("duplicate char are"+" "+ch[i]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
