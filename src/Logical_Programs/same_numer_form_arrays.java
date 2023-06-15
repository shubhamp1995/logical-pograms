package Logical_Programs;

public class same_numer_form_arrays {
	public static void main(String[] args) {
		int ar1[]= {10,20,30,40,50};
		int ar2[]= {10,20,70,80,50};
				
		for(int i=0;i<=4;i++) {
			if(ar1[i]==ar2[i]) {
				System.out.println(ar1[i]+" "+ar2[i]);
			}
		}
	}
}
