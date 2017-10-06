package com.example.JavaAlg;

import java.util.Stack;

public class SpecialStackTest {

	public static void main(String[] args) throws StackEmptyException {
		SpecialStack ss = new SpecialStack();
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(16);
		stack.add(15);
		stack.add(29);
		stack.add(19);
		stack.add(18);
		ss.getMin(stack);
		stack.add(3);
		ss.getMin(stack);
	}

}
