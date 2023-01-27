package com.sdet.Collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		
		//Adding elements
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		//q.add(100); //--class cast exception

		System.out.println(q); //[A, B, C, C] //insertion order is preserved & duplicates allowed
		
		//get head element  //element()    //peak()

		//System.out.println(q.element()); //A // returns head element -- IF EMPTY- NO SUCH ELEMENT EXCEPTION
		
		//System.out.println(q.peek());//A // returns head element -- IF EMPTY- null
		
		
		//return and remove elements from queue
		
		//remove()
		
		//System.out.println(q.remove()); //A
		
		//System.out.println(q); // [B, C, C]
		
		//System.out.println(q.poll()); //A
		
		//System.out.println(q); //[B, C, C]
		
		
		//System.out.println(q.remove()); //no such element exception
		
		System.out.println(q.poll());  // null
		
		//Iterator it=q.iterator();
		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		for (Object e : q) {
			System.out.println(e);
		}
		
		
	}
}
