package com.sdet.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		//Declare ArrayList
//		ArrayList al=new ArrayList();
		
		//ArrayList<Integer> al=new ArrayList<Integer>();
		
		//ArrayList<String> al=new ArrayList<String>();
		
			//List al=new ArrayList();
		
		ArrayList al=new ArrayList();
		
		//Add new elements to the ArrayList
		
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		al.add(null);
		
		System.out.println(al);
		
		//size()
		
		System.out.println("Number of Elements in array list :"+al.size());
		
		//remove
		
		al.remove(1);//here 1 is index
		
		//al.remove("welcome");//here welcome is element
		System.out.println("After removing element from arraylist: "+al);
		
		//insert a new element
		
		//add(index,object)
		
		al.add(2,"python");
		
		System.out.println("After insertion : "+al); //[100, 15.5, python, A, true]

		//retrieve specific element
		System.out.println(al.get(2));
		
		//change element
		
		al.set(2, "C#");
		
		System.out.println("After replacing element :"+al);
		
		//search - contains - RETURN TRUE OR FALSE
		
		System.out.println(al.contains("C#"));//true
		System.out.println(al.contains("C++"));//false
		
		//IS EMPTY
		
		System.out.println(al.isEmpty());//false
		
		//how to read all elements of arraylist
		
		//1) for loop
//		System.out.println("Reading elements using for loop: ");
//		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		
		//2) for each loop
//		System.out.println("Reading elements using for each loop: ");
//		for(Object e:al)
//		{
//			System.out.print(":"+e);
//		}
		
		
		
		//iterator()
		System.out.println("Reading elements using for iterator method: ");
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	
	
	
	}
	
}
