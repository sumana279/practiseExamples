package com.example.JavaAlg;

public class PowerOf4 {

	public static boolean isPowerOfFour(int num) {
		if (num == 0)
			return false;

		int pow = (int) (Math.log(num) / Math.log(4));
		System.out.println((Math.log(num) + " Logs of " + num));
		System.out.println((Math.log(4) + " Logs of " + 4));

		int xy = (int) Math.pow(4, pow);
		if (num == xy) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPowerOfThree(int num) {
		if (num == 0)
			return false;

		int pow = (int) (Math.log(num) / Math.log(3));
		System.out.println((Math.log(num) + " Logs of " + num));
		System.out.println((Math.log(3) + " Logs of " + 3));

		int xy = (int) Math.pow(3, pow);
		if (num == xy) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPowerOfTwo(int num) {
		if (num == 0)
			return false;

		int pow = (int) (Math.log(num) / Math.log(2));
		System.out.println((Math.log(num) + " Logs of " + num));
		System.out.println((Math.log(2) + " Logs of " + 2));

		int xy = (int) Math.pow(2, pow);
		if (num == xy) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(isPowerOfFour(64));
		System.out.println(isPowerOfThree(81));
		System.out.println(isPowerOfTwo(1024));

	}
}
