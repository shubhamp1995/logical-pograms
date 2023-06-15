package Logical_Programs;

import java.util.Arrays;

public class largest_num_in_Arrays 
{
public static void main(String[] args) {
	int ar[]= {5,3,2,8,5,9};
	Arrays.sort(ar);
	System.out.println(ar.length);
	System.out.println("largest digit is"+" "+ar[ar.length-1]);
	System.out.println("second largest digit is"+" "+ar[ar.length-2]);
	System.out.println(ar[0]);
}
}
