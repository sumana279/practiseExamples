package com.example.JavaAlg;

public class MergeSort {

	private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28 };
		MergeSort mms = new MergeSort();
		mms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(inputArr);
	}

	private void doMergeSort(int[] arrayToSort) {
		int length = arrayToSort.length;
		int[] arrayLeft;
		int[] arrayRight;

		int mid;
		if (length < 2) {
			return;
		}
		mid = length / 2;
		arrayLeft = new int[mid];
		arrayRight = new int[length - mid];

		for (int i = 0; i < mid; i++) {
			arrayLeft[i] = arrayToSort[i];
		}
		for (int i = mid; i < length; i++) {
			arrayRight[i - mid] = arrayToSort[i];
		}
		doMergeSort(arrayLeft);
		doMergeSort(arrayRight);
		doMergeFinal(arrayToSort, arrayLeft, arrayRight, mid, length - mid);
	}

	private void doMergeFinal(int[] arrayToSort, int[] arrayLeft, int[] arrayRight, int leftCount, int rightCount) {

		int i = 0, j = 0, k = 0;

		while (i < leftCount && j < rightCount) {
			if (arrayLeft[i] <= arrayRight[j]) {
				arrayToSort[k] = arrayLeft[i];
				k++;
				i++;
			} else {
				arrayToSort[k] = arrayRight[j];
				k++;
				j++;
			}
		}
		while (i < leftCount) {
			arrayToSort[k] = arrayLeft[i];
			k++;
			i++;
		}
		while (j < rightCount) {
			arrayToSort[k] = arrayRight[j];
			k++;
			j++;
		}
	}
}
