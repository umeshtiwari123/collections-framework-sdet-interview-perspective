package com.sdet.Collections.Queue;

import java.util.LinkedList;

public class QueueLinkedList {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
	
		//Adding elements add() offer()
		
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.offer(100); //not allowed in queue heterogeneous data
		l1.add("C");
		
		System.out.println(l1); //[A, B, C, 100, C]
		
		//GET HEAD ELEMENT -- element() peek()
		
		System.out.println(l1.element()); //A
		
		System.out.println(l1.peek()); //A
		
		//removing elements
		
		System.out.println(l1.remove()); //A
		
		System.out.println(l1); // [B, C, 100, C]
		
		System.out.println(l1.poll()); //B
		
		System.out.println(l1); // [C, 100, C]

	
	}
}
