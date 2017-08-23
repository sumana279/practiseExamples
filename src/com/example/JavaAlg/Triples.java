package com.example.JavaAlg;

public class Triples {

	public static void triangleTriplet(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; j < n; j++) {
					if (i != j && j != k && i != k)
						if (a[j] > a[k] - a[i] && a[k] > a[i] - a[j] && a[k] > a[j] - a[i]) {
							System.out.println(a[i] + " " + a[j] + " " + a[k]);
						}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 4, 22, 7, 5, 10 };
		triangleTriplet(nums);
	}

}
