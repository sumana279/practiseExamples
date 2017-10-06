package com.example.JavaAlg;

import java.util.Random;

public class RandomizeArrayOn {
	int[] theArray = { 1, 2, 3, 4, 5, 6, 7 };
	Boolean flag = false;

	private void swap(int i, int j) {
		int temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;
		flag = true;
	}

	private void randomizeArray() {
		Random rr = new Random();
		
		for (int i = 0; i < theArray.length; i++) {
			swap(i, rr.nextInt(theArray.length));
		}
	}

	private void display() {
		for (int i : theArray) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		RandomizeArrayOn rAon = new RandomizeArrayOn();
		rAon.randomizeArray();
		rAon.display();

	}

}
