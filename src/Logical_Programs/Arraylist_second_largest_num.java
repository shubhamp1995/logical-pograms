package Logical_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;



public class Arraylist_second_largest_num 
{
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(101);
	list.add(111);
	list.add(123);
	list.add(124);
	list.add(124);
	list.add(108);
	list.add(145);
	
	
	System.out.println(list.size());
	Collections.sort(list);
	System.out.println("largest num"+" "+list.get(list.size()-1));
	System.out.println("second largest num"+" "+list.get(list.size()-3));
	
	
	
	
	
}
}
