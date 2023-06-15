package Logical_Programs;

import java.util.HashSet;
import java.util.TreeSet;

public class remove_duplinum 
{
public static void main(String[] args) {
	int ar[]= {1,1,2,4,3,5,4,6,7,3,};
	HashSet <Integer>hs=new HashSet();
	//TreeSet ts=new TreeSet();
	for(int i=0;i<=ar.length-1;i++)
	{
		hs.add(ar[i]);
	}
	for(Integer s1:hs)
	{
		System.out.println(s1);
	}
	
	
//	//int temp[]=new int[ar.length];
//	int j=0;
//	for(int i=0;i<ar.length-1;i++)
//	{
//		if(ar[i]!=ar[i+1])
//		{
//			ar[j]=ar[i];
//			j++;
//			
//		}
//	}
//	ar[j++]=ar[ar.length-1];
//	for(int k=0;k<j;k++)
//	{
//		System.out.println(ar[k]);
//	}
	
}
}
