package com.sdet.Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		//HashMap m=new HashMap();
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		
		
		//HashMap m=new HashMap();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "X");
		m.put(106, "David");
		
		System.out.println(m); // {101=John, 102=David, 103=X, 104=Mary, 105=Tye, 106=David}
		System.out.println(m.get(105));  //Tye
		
		m.remove(106); //remove pair from hashmap
		
		System.out.println(m); // {101=John, 102=David, 103=X, 104=Mary, 105=Tye}

		System.out.println(m.containsKey(101));//true
		System.out.println(m.containsKey(106)); //false
		
		System.out.println(m.containsValue("Mary"));//true
		
		System.out.println(m.containsValue("Y"));//false
		
		System.out.println(m.isEmpty()); // false
		
		System.out.println(m.keySet()); // [101, 102, 103, 104, 105]  // returns all the keys as Set

		//System.out.println(m.values()); // [John, David, X, Mary, Tye] // returns all the values as Collections
		
		//System.out.println(m.entrySet()); // [101=John, 102=David, 103=X, 104=Mary, 105=Tye] // returns all the entries as Set
		
		
		for(Object i:m.keySet())
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(Object j:m.values())
		{
			System.out.print(j+" ");
		}
		
		
		//both key and value side by side
		
		System.out.println();
		for(Object i:m.keySet())
		{
			System.out.print(" , "+i+"  =  "+m.get(i));
		}
		
		//Entry Methods
		//******************************
		
		System.out.println();
		
//		for(Map.Entry entry : m.entrySet())
//		{
//			System.out.println(entry.getKey()+ "     "+ entry.getValue());
//		}
		
		//Iterator method
		
		Set s=m.entrySet();
		
		Iterator itr = s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"      "+entry.getValue());
		}
		
		
		
	}
}
