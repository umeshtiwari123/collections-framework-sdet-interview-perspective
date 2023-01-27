package com.sdet.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistDemo3 {

	public static void main(String[] args) {
		
		String arr[]= {"Dog","Cat","Elephant"};
		
		for (String value : arr) {
			System.out.println(value);
		}
		
		//to convert all the arrays to arraylist
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);

	}

}
