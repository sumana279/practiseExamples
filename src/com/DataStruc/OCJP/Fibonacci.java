package com.DataStruc.OCJP;

//3!= 3*2*1 = 6
public class Fibonacci {

	public int value4Fibonacci(int input) {
		int value = 0;

		if (input == 1) {
			return 1;
		} else {
			value = input * value4Fibonacci(input - 1);
		}
		return value;
	}

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		System.out.println(fb.value4Fibonacci(5));
	}

}
