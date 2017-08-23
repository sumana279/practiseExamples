package com.example.JavaAlg;

import java.util.Stack;

public class ZerosCount {

	public static void main(String[] args) {
		int[] zerosCount = { 2, 1, 0, -1, -2, -2 };
		// Stack<Integer> stack = new Stack<Integer>();
		// while (!stack.isEmpty()) {
		// stack.pop();
		// }
		// for (int i : zerosCount) {
		// if (i == 0) {
		// stack.push(i);
		// }
		// }
		//
		// System.out.println(stack.size());
		ZerosCount zc = new ZerosCount();
		System.out.println(zc.zeroCount(zerosCount));

	}

	public int zeroCount(int[] arrays) {
		int mid, low = 0, high = arrays.length - 1;
		Stack<Integer> stack = new Stack<Integer>();
		// mid = (low + high) / 2;

		while (low < high) {
			mid = (low + high) / 2;
			if (arrays[mid] == 0) {
				for (int i = low; i <= high; i++) {
					if (arrays[i] == 0) {
						stack.push(arrays[i]);
					}
				}
				break;
			}

			if (arrays[low] < arrays[mid]) {
				high = mid;
			} else if (arrays[mid] > arrays[high]) {
				low = mid;

			}
			for (int i = low; i <= high; i++) {
				if (arrays[i] == 0) {
					stack.push(arrays[i]);
				}
			}
			low = high;
		}

		return stack.size();
	}

}
