package com.sdet.Collections.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {

		// LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();

		// HashSet lset=new HashSet();
		LinkedHashSet lset = new LinkedHashSet();

		lset.add(100);
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);

		System.out.println(lset); // [100, 200, 300, 400, 500] --Using linkedhashSet insertion order is preserved

		// [400, 100, 500, 200, 300] --Using HashSet no insertion order

	}
}
