package com.example.JavaAlg;

import java.util.LinkedList;
import java.util.Queue;

public class IntToBinaryDigits {

	final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void printBinary(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(toUnsignedString(i, 1));

		}
	}

	private static String toUnsignedString(int i, int shift) {
		char[] buf = new char[32];
		int charPos = 32;
		do {
			buf[--charPos] = digits[i & shift];
			i = i >> shift;
		} while (i != 0);

		return new String(buf,charPos,32-charPos);
	}

	public static void main(String[] args) {
		printBinary(2000000);

	}

}
