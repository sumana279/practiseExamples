package com.example.JavaAlg;

import java.util.Random;

public class ArrayStructures {

	private int[] theArray = { 7, 5, 4, 2 };
	private int arraySize = 10;
	boolean flag = true;
	Random r = new Random(10);

	public void insertArray() {
		for (int i = 0; i <= arraySize; i++) {
			theArray[i] = r.nextInt(50);
		}
	}

	public void printArray() {
		for (int j = 0; j < arraySize; j++) {
			System.out.println("The contencts at " + j + " are " + theArray[j]);
		}
	}

	public int getValueAtIndex(int index) {
		if (index < arraySize) {
			return theArray[index];
		}
		return 0;
	}

	public boolean doesArrayContainThisValue(int searchValue) {
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == searchValue) {
				return true;
			}
		}

		return false;

	}

	public void deleteIndex(int index) {
		if (index < arraySize) {
			for (int i = index; i < arraySize; i++) {
				theArray[i] = theArray[i + 1];
			}
			arraySize--;
		}
	}

	public void insertValue(int value) {
		if (arraySize < 50) {
			theArray[arraySize++] = value;
		}
	}

	public void linearSearch4AllValues(int valuesInNeed) {
		String indexWithValue = "";

		for (int i = 0; i < arraySize; i++) {
			if (valuesInNeed == theArray[i]) {
				indexWithValue = indexWithValue + " " + i;
			}

		}
		System.out.println("The values are present at" + indexWithValue);
	}

	public void bubbleSort(int[] theArray) {
		for (int i = arraySize - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray[j] > theArray[j + 1]) {
					swap(j, j + 1);

				}
			}
		}
	}

	public void bubbleSortDup() {

		while (flag) {
			flag = false;
			for (int i = 0; i < arraySize - 1; i++) {
				if (theArray[i] > theArray[i + 1]) {
					swap(i, i + 1);
				}
			}

		}
	}

	public void binerySearch(int valueInSearch) {
		int higherIndex = arraySize;
		int lowerIndex = 0;
		int middleIndex = lowerIndex + higherIndex / 2;
		boolean flag = true;

		while (flag && lowerIndex <= higherIndex) {
			if (valueInSearch > theArray[middleIndex]) {
				lowerIndex = middleIndex + 1;
			} else if (valueInSearch < theArray[middleIndex]) {
				higherIndex = middleIndex - 1;
			} else if (valueInSearch == theArray[middleIndex]) {
				System.out.println("Element Found at " + middleIndex);
				break;
			}
			middleIndex = (lowerIndex + higherIndex) / 2;
		}

	}

	public void selectionSort() {
		for (int i = 0; i < arraySize; i++) {
			int min = i;
			for (int j = i; j < arraySize; j++) {
				if (theArray[j] < theArray[min]) {
					min = j;
				}

			}
			swap(i, min);
		}

	}

	public void insertionSort() {
		for (int i = 0; i < theArray.length-1; i++) {
			for (int j = i; j >= 0; j--)
				if (theArray[j] > theArray[j + 1]) {
					swap(j, j + 1);
				}
		}
		
		for (int i : theArray) {
			System.out.print(" ");
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private void swap(int i, int j) {
		int temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;
		flag = true;
	}

}
