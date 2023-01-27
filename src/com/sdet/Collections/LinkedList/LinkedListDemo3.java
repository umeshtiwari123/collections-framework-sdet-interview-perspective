package com.sdet.Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		System.out.println(l); //[dog, dog, cat, horse]
	
		//addFirst()
		l.addFirst("Tiger");
		l.addLast("Elephant");
		System.out.println("After adding first and last element: "+l); //[Tiger, dog, dog, cat, horse, Elephant]

		System.out.println(l.getFirst()); //Tiger
		System.out.println(l.getLast()); //Elephant
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing first and last element: "+l);
		
		
	
	
	}

}
