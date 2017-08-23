package com.example.JavaAlg;

import java.util.*;
import java.lang.*;
import java.io.*;

public class HighestAlphaNumberic {
	public static int highestNo(String str) {
		Stack<Integer> stack = new Stack<Integer>();
		String[] array = str.replaceAll("[^0-9]+", ",").split(",");
		for (String i : array) {
			i = i.replaceAll("^,", "").replaceAll("$,", "");
			if (!i.isEmpty()) {
				int num = Integer.parseInt(i.trim());
				if (!stack.isEmpty()) {
					int onStack = (int) stack.peek();
					int stackTop = (int) stack.pop();
					if (num > onStack) {
						stack.push(num);
					} else {
						stack.push(stackTop);
					}
				} else {
					stack.push(num);
				}
			}
		}

		return stack.pop();
	}

	public static void main(String[] args) {

		System.out.println(highestNo("abchsd0sdhs"));
	}
}