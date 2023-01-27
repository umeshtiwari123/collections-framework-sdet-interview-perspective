package com.sdet.Collections.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemoSelf {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "Physics");
		hm.put(102, "Chemistry");
		hm.put(103, "Maths");
		hm.put(103, "English");
		
		hm.put(103, "Biology");
		hm.put(104, "Accounts");
		hm.put(105, "Biology");
		hm.put(106, "English");

		System.out.println(hm);
		
		Set<Integer> s1=hm.keySet();
		
		System.out.println(s1);
	}
}
