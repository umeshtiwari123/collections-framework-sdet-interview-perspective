package com.sdet.Collections.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		Object object[] = new Object[5];

		object[0] = "Hi";
		object[1] = 1234;
		object[2] = 10.55;
		object[3] = 1234567;
//		object[4]='x';
		object[4] = "list";

		for (Object x : object) {

			System.out.println(x);
		}
		
		Set s1=new HashSet();
		
		ArrayList<String> al=new ArrayList<String>();
	}
}
