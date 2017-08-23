package com.example.JavaAlg;

import java.util.Stack;

public class StockSpanProb {

	public void calculateSpan(int[] stockRange, int[] outPut) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		outPut[0] = 1;
		int i = 1;
		int cnt = 0;
		while (i < stockRange.length) {
			cnt = 0;
			if (stack.peek() > stockRange[i]) {
				stack.push(i);
				outPut[i] = 1;
			} else {
				while (stack.peek() < stockRange[i]) {
					stack.pop();
               
				}
				
				System.out.println(" cnt is " + cnt +  " stack " + stockRange[i]);
				outPut[i] = i - stack.peek();
				stack.push(i);
			}
			i++;

		}
		
		for(int j=0; j< outPut.length;j++){
			System.out.print(outPut[j]);
			System.out.print(" ");
		}

	}
}
