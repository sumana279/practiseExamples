package com.example.JavaAlg;

import java.util.Stack;

public class ReverseAString {
	public static void reverseAString(String str) {
		Stack stack = new Stack();
		while (!stack.isEmpty()) {
			stack.pop();
		}
		char[] chars = str.toCharArray();

		for (char c : str.toCharArray()) {
			stack.push(c);
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}

	public static void main(String[] args) {
		reverseAString("sudhan");
	}

}
