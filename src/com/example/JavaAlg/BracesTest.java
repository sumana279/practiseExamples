package com.example.JavaAlg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class BracesTest {

	public static String[] isValid(String[] s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		Stack<Character> stack = new Stack<Character>();
		String[] array = new String[10];
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
			for (int i = 0; i < s[j].length(); i++) {
				char curr = s[j].charAt(i);

				if (map.keySet().contains(curr)) {
					stack.push(curr);
				} else if (map.values().contains(curr)) {
					System.out.println(stack. peek());
					if (!stack.empty() && map.get(stack.peek()) == curr) {
						stack.pop();
					} else {
						array[j] = "false";
						return array;
					}
				}

			}
			array[j] = "true";

		}
		return array;

	}

	public static void main(String[] args) {
		String[] input1 = { "{({()}}" };
		// System.out.println(isValid(i));
		System.out.println(Arrays.toString(isValid(input1)));

	}

}
