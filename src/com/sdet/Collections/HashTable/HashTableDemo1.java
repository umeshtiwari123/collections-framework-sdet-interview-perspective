package com.sdet.Collections.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo1 {

	public static void main(String[] args) {
		
		//Hashtable ht=new Hashtable(); //default capacity is 11 , load factors 0.75
		
		//Hashtable t=new (initial capacity); //create hashtable object with some capacity
		
		//	Hashtable t=new Hashtable(initial capacity, fill ratio/load factor);
		
		Hashtable<Integer,String> t=new Hashtable<Integer, String>();
		
		t.put(101,"John");
		t.put(102, "David");
		t.put(103, "Smith");
		// t.put(null, "X"); //Null Pointer Exception
		//t.put(104, null); // //Null Pointer Exception
		
		System.out.println(t);
		
		System.out.println(t.get(103)); //Smith
		
		t.remove(103);
		
		System.out.println("After Removing : "+t); // {102=David, 101=John}
		
		System.out.println(t.containsKey(102)); //true
		System.out.println(t.containsKey(105)); //false
		
		System.out.println(t.containsValue("David")); // true
		System.out.println(t.containsValue("Y")); // false
		
		System.out.println(t.isEmpty()); //false
		
		System.out.println(t.keySet()); // [102, 101]
		
		System.out.println(t.values()); // [David, John]
		
//		for(int k : t.keySet())
//		{
//			System.out.println(k+"   "+t.get(k));
//		}
		
		// Entry Specific Methods.....
		
		for(Map.Entry entry:t.entrySet())
		{
			System.out.println(entry.getKey()+"    "+entry.getValue()); // (key,  value) 
		}
		
		//iterator
		
		Set s=t.entrySet();
		
		Iterator itr=s.iterator();
		
		while (itr.hasNext()) {
			
		Map.Entry entry1=(Entry) itr.next();    //(101, x)
		
		System.out.println(entry1.getKey()+"    "+entry1.getValue());
		}
		
		
		
		
		
		
		

		
		
	}
}
