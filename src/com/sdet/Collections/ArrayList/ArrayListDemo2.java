package com.sdet.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup=new ArrayList();
		
		al_dup.addAll(al);
		
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		
		System.out.println("After Removing: "+al_dup);
		
		//Sort -- Collections.sort
		
		System.out.println("Elements in the Array List: "+al);
		Collections.sort(al);
		
		System.out.println("Elements in the Array List After Sorting: "+al);
		
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println("Elements in the Array List After Sorting in reverse order: "+al);
		
		//Shuffling -- Collections.shuffle()
		
		Collections.shuffle(al);
		
		System.out.println("Elements in the Array List After Shuffling: "+al);
		
		
		
		
	}
}
