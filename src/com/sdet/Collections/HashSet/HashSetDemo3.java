package com.sdet.Collections.HashSet;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		//Union of Set, Intersection of Set, Difference of Set
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("HashSet 1 :"+set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		System.out.println("HashSet 2 :"+set2);
		
		//union
		
		//set1.addAll(set2);
		//System.out.println("Union of Set 1 and set2 :"+set1); // [1, 2, 3, 4, 5, 6]
	
		//intersection
		//set1.retainAll(set2);
		
		//System.out.println("Intersection Elements are :"+set1); // [3, 4, 5]
		
		//difference elements
		//set1.removeAll(set2);
		
		//System.out.println("Difference Elements are: "+set1); // [1, 2]
	
		//subset - set1
		set1.containsAll(set2);
		System.out.println("Subset Set1 :"+set1); // [1, 2, 3, 4, 5]
		
		
		//subset - set2
		set2.containsAll(set1);
		System.out.println("Subset Set2 :"+set2); // [3, 4, 5, 6, 7]
	
		System.out.println(set1.containsAll(set2));//false
	}
}
