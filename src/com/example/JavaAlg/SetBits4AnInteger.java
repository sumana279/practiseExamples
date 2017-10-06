package com.example.JavaAlg;

public class SetBits4AnInteger {
	public int bitsSet(int num) {
		int count = 0;
		int val = num;
		while (val > 0) {
			val = val & val - 1;
			count++;
		}
		return count;

	}

	public static void main(String[] args) {

		SetBits4AnInteger ssd = new SetBits4AnInteger();

		System.out.println(ssd.bitsSet(7));
	}
}
