package Logical_Programs;

import java.util.Arrays;

public class second_largest_numinarrys_withoutsorting 
{
public static void main(String[] args) 
{
int ar[]= {2,1,120,5,3,8,9,55,23,67,80,90,90,100};
//Arrays.sort(ar);
//System.out.println(ar[0]);//samllest
//System.out.println(ar[ar.length-1]);//largest
//System.out.println(ar[ar.length-2]);//second

int largest=ar[0];//1
int seclargest=ar[0];//2
int smallest=ar[0];//2
for(int i=0;i<=ar.length-1;i++)//0,1,2,3,4,5
{
	if(ar[i]<smallest)//1<2
	{
		smallest=ar[i];//1
	}
	if(ar[i]>largest)//9>8
	{
		seclargest=largest;//5
		largest=ar[i];//2
	}
	if(ar[i]>seclargest && ar[i]<largest)//9>8,9<9
	{
		seclargest=ar[i];
	}
}
System.out.println("smallest num is"+" "+smallest);
System.out.println("largest num is"+" "+largest);
System.out.println("seclagest num is"+" "+seclargest);
}
}
