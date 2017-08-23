package com.example.JavaAlg;

import java.util.Stack;

public class CodingExamples {

	public void bracketMisMatch(String str) {
		int len = str.length();
		int n = 0,m=0;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '}' && !stack.isEmpty()) {
				if (stack.peek().equals('{')) {
					stack.pop();
				} else {
					stack.push(str.charAt(i));
				}
			} else {
				stack.push(str.charAt(i));
			}
		}

		System.out.println(stack.size());
        len =stack.size();
        
		while (!stack.isEmpty() && stack.peek() == '{') {
			stack.pop();
			n++;
		}
		while (!stack.isEmpty() && stack.peek() == '}') {
			stack.pop();
			m++;
		}

		System.out.println(len/2 + n % 2);
	}

	public static void main(String[] args) {
		CodingExamples ce = new CodingExamples();
		ce.bracketMisMatch("}{{}}{{{");
		// }}}}{{  {} {}
	}
}