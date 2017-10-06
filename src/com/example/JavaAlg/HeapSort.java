package com.example.JavaAlg;

import java.util.Arrays;
import java.util.Scanner;

class HeapSort {
	private static Scanner sc;

	public static void main(String args[]) {

		System.out.println("Enter the terms");
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("The unsorted array is:");
		System.out.println(Arrays.toString(arr));

		heap(arr);

		System.out.println("The sorted array is:");
		System.out.println(Arrays.toString(arr));
	}

	static void heapify(int a[], int n, int i) {
		int max, child;
		int childLeft = 2 * i + 1;
		int childRight = 2 * i + 1 + 1;

		max = i;
		if (childLeft < n)
			if (a[childLeft] > a[max])
				max = childLeft;
		if (childRight < n)
			if (a[childRight] > a[max])
				max = childRight;
		if (max != i) {
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;
			heapify(a, n, max);
		}
	}

	static void buildheap(int a[]) {
		for (int i = a.length / 2 - 1; i >= 0; i--) {
			heapify(a, a.length, i);
			System.out.println("after Interation " + i);
			System.out.println(Arrays.toString(a));

		}
	}

	static void heap(int a[]) {
		buildheap(a);
		System.out.println("Final Interation ");
		System.out.println(Arrays.toString(a));
		for (int i = a.length - 1; i >= 1; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a, i, 0);
		}
		System.out.println("Ascend Interation ");
		System.out.println(Arrays.toString(a));

	}
}