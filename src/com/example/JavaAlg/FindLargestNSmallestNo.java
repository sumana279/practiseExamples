package com.example.JavaAlg;

import java.util.Date;

public class FindLargestNSmallestNo {

	public static void main(String[] args) {

		// array of 10 numbers
		int arr[] = new int[] { 12, 56, 76, 89, 100, 343, 21, 234 };
		// QuickSort qs = new QuickSort();
		// MergeSort ms = new MergeSort();
		ArrayStructures as = new ArrayStructures();
		// as.bubbleSort(arr);
		// long start = System.currentTimeMillis();
		// qs.sort(arr); < =4
		// ms.sort(arr); //< = 1
		System.out.println(arr[0] + " smallest# " + arr[arr.length - 1] + " largest #");
		// System.out.println(System.currentTimeMillis() - start + " Duration");
		// // 4

	}

}
