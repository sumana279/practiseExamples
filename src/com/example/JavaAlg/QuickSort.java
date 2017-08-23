package com.example.JavaAlg;

public class QuickSort {
	public int[] numbers;

	public void sort(int[] numbers) {
		this.numbers = numbers;
		// display();
		System.out.println("  ");
		quickSort(numbers, 0, numbers.length - 1);
	}

	private void quickSort(int[] numbers, int start, int end) {
		int partionIndex = 0;
		if (start < end) {
			System.out.println("first Sort " + partionIndex);

			partionIndex = partion(numbers, start, end);
			quickSort(numbers, start, partionIndex - 1);
			System.out.println("Second Sort " + partionIndex);
			quickSort(numbers, partionIndex, end);

		}

	}

	private int partion(int[] num, int start, int end) {

		int pivot = num[end];
		System.out.println(" pivot values was : " + pivot);

		int pIndex = start;

		for (int i = start; i <= end - 1; i++) {
			System.out.println(" pIndex " + (pIndex) + " indexPost " + (i));
			System.out.println("   ");
			display();
			if (num[i] <= pivot) {

				swap(i, pIndex);

				pIndex++;
			}
		}
		swap(pIndex, end);
		display();
		System.out.println(" pIndex returned " + num[pIndex]);
		return pIndex;
	}

	private void swap(int i, int j) {

		int temp = numbers[i];
		System.out.println("swapping the no " + temp + " and " + numbers[j]);

		numbers[i] = numbers[j];
		numbers[j] = temp;

	}

	public void display() {
		for (int x : numbers) {
			System.out.print(x + " ");
		}
	}
}
