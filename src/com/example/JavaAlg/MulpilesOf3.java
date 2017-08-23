package com.example.JavaAlg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MulpilesOf3 {

	public static Integer[] isMulipleof3(Integer[] num, int remainder) {
		Stack<Integer> stack = new Stack();
		Stack<Integer> stack2 = new Stack();
		while (!stack.isEmpty()) {
			stack.pop();
		}
		for (Integer i : num) {
			if (i % 3 == remainder) {
				if (stack.size() == 0) {
					stack.push(i);
				} else {
					int min = stack.peek();
					if (min > i) {
						stack.pop();
						stack.push(i);
					} else {
						stack.push(min);
					}

				}
			} else if (remainder == 2) {
				if (i % 3 == 1) {
					if (stack.size() == 0) {
						stack.push(i);
						stack2.push(-1);
					} else {
						int min = stack.peek();
						int secondMin = min;

						if (min > i) {
							stack.pop();
							stack.push(i);
						} else if (i >= min && i <= secondMin) {
							stack2.pop();
							stack2.push(i);
						}
					}
				}
			}

		}

		int element2Delete = 0;
		if (!stack.isEmpty()) {
			element2Delete = stack.pop();
		}
		int element2Delete2 = 0;
		if (!stack2.isEmpty()) {
			element2Delete2 = stack2.pop();
		}
		
		for (int j = 0; j < num.length; j++) {
			if (num[j] == element2Delete) {
				num[j] = -1;
				element2Delete = -1;
			} else if (num[j] == element2Delete2) {
				num[j] = -1;
				element2Delete2 = -1;
			}

		}
		return num;
	}

	public static void main(String[] args) {
		Integer[] nums = { 4, 4, 1, 1, 1, 3 };
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		// System.out.println(sum);
		isMulipleof3(nums, sum % 3);
		Arrays.sort(nums, Collections.reverseOrder());
		printData(nums);
	}

	private static void printData(Integer[] nums) {
		for (int i : nums) {
			if (i > 0) {
				System.out.print(i);
			}
		}
	}

}
