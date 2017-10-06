package com.example.JavaAlg;

import java.util.Stack;

public class SpecialStack {

	public void getMin(Stack<Integer> stack) throws StackEmptyException {
		Stack<Integer> aux = new Stack<>();
		int i = 0;
		if (stack.empty()) {
			throw new StackEmptyException("Stack Cannot be empty");
		} else {
			aux.push(stack.peek());

			while (!stack.isEmpty()) {
				if (stack.peek() >= aux.peek()) {
					stack.pop();
				} else {
					aux.pop();
					aux.push(stack.peek());

				}
				stack.pop();
			}
		}
		System.out.println("Min no from stack is " + aux.peek());
	}

}
