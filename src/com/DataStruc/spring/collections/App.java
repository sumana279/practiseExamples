package com.DataStruc.spring.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		/*
		 * Use ArrayList when you want to remove elements from either from
		 * begining or ending If deletion and insertion happens in between then
		 * linkedList is preferred.
		 */
		doTiming("ArrayList", arrayList);
		doTiming("linkedList", arrayList);

	}

	private static void doTiming(String string, ArrayList<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		long stop = System.currentTimeMillis();
		System.out.println("The time taken: " + (stop - start) + " ms for " + string);

	}

}
