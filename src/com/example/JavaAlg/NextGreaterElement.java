package com.example.JavaAlg;

import java.util.Stack;

public class NextGreaterElement {

	public void nge(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int next = -1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					next = nums[j];
					break;
				}

			}
			System.out.println(nums[i] + " values for next " + next);
		}
	}

	public void reverseStack(int[] nums) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (stack.isEmpty()) {
				stack.push(nums[0]);
			} else {
				stack.push(nums[i]);
			}
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

	public Boolean isEmptyStack(Stack stack) {
		while (!stack.isEmpty()) {
			return false;
		}
		return true;
	}

	public void sortArray(Stack<Integer> stack) {

		int temp = stack.pop();
		sortArray(stack);
		// sortInsert(stack,temp);

	}

	public static void main(String[] args) {
		int[] nums = new int[] { 11, 13, 21, 3 };
		Stack<Integer> stack = new Stack<Integer>();
		NextGreaterElement neg = new NextGreaterElement();
		neg.nge(nums);
		// neg.reverseStack(nums);
		stack.push(11);	
		stack.push(13);
		stack.push(21);
		stack.push(3);

		neg.sortArray(stack);

	}

}
