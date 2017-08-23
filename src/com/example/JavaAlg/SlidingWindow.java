package com.example.JavaAlg;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {

	private static List<Integer> windowMax(int[] arrays, int window) {
		int length = arrays.length;
		int max = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			int windowRange = i + window;
			max = arrays[i];

			int counter = windowRange > length ? length - windowRange : windowRange;
			for (int j = i; j < counter; j++) {
				if (arrays[j] > max) {
					max = arrays[j];
				}

			}
			if(length-windowRange<length){
			list.add(max);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		int[] array = { 12, 1, 78, 90, 57, 89, 56 };
		List<Integer> lists = windowMax(array, 3);
		for (int i : lists) {
			System.out.println("Output of max " + i);
		}

	}

}
