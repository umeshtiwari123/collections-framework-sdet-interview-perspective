package com.sdet.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declare Linked List
		
		LinkedList l=new LinkedList();
		
		//LinkedList<Integer> l=new LinkedList<Integer>();
		//LinkedList<String> l=new LinkedList<String>();
		
		//Add elements into linked list
		
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);//[100, welcome, 15.5, A, true, null]
		System.out.println(l.size());//6
		
		//remove
		l.remove(3);//index
		//l.remove("welcome");
		System.out.println("After removing , new list is: "+l);//[100, welcome, 15.5, true, null]
		
		//insert/ adding elements in the middle of linked list
		
		l.add(3,"Java");
		
		System.out.println("After inserting the element the new list is: "+l); //[100, welcome, 15.5, Java, true, null]
		
		//retrieving the value/Object
		System.out.println(l.get(3));//Java
		
		//change the element or value
		l.set(5, "X");
		
		System.out.println("After changing the value: "+l); //[100, welcome, 15.5, Java, true, X]

		//contains()
		
		System.out.println(l.contains("Java")); //true
		System.out.println(l.contains("Python")); //false
		
		//isEmpty()
		System.out.println(l.isEmpty()); //false
		
			
		//Reading Objects or elements from LL using for loop
		
		/*for (int i = 0; i < l.size(); i++) {
			System.out.print(" "+l.get(i));
			
		}*/
		
		//Reading Objects or elements from LL using for-each loop
		
		/*for(Object e:l)
		{
			System.out.print(" "+e);
		}*/
		
		//iterator method
		
		Iterator it=l.iterator();
		
		while(it.hasNext())
		{
			System.out.print(" : "+it.next());
		}
		
		
		

		
		
	}
	
}
