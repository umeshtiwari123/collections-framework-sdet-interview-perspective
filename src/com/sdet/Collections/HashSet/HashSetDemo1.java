package com.sdet.Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		//HashSet hs=new HashSet(); //default capacity is 16 load factor is 0.75
		
		//HashSet hs=new HashSet(100); //initial capcity = 100
		
		//HashSet hs=new HashSet(100,(float) 0.90);
	
		//HashSet<Integer> hs=new HashSet<Integer>();
	
		HashSet hs=new HashSet();  //default capacity is 16 load factor is 0.75
		
		//Add objects or elements into hashset
		
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs); //[null, A, 100, 16.4, welcome, true] //Insertion order not preserved
		
		//remove()
		
		hs.remove(16.4); //value
		
		System.out.println("After removing the element : "+hs); // [null, A, 100, welcome, true]

		//contains()
		
		System.out.println(hs.contains("welcome")); //true
		
		System.out.println(hs.contains("xyz")); //false
		
		System.out.println(hs.isEmpty());//false
		
		
		//Reading objects or elements from hashset using for each loop
		
		
		/*for(Object obj:hs)
		{
			System.out.print(" "+obj);
		}*/
		
		//Reading objects or elements from hashset using Iterator
		
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.print(" "+it.next());
		}
		
		
	}
}
