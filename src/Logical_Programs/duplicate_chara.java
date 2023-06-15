package Logical_Programs;

public class duplicate_chara {

	public static void main(String[] args) {
		String s1="ababcdedseab";
		//String[] ch=s1.split("");
		char[]ch=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++) 
			{
				
				if(ch[i]==ch[j]) {
					
					System.out.println("duplicate char are"+" "+ch[i]);
				}
				
			}
			
		}
		
	}
}

