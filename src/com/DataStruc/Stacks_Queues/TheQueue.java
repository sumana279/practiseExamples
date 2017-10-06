package com.DataStruc.Stacks_Queues;

public class TheQueue {

	private String[] queueArray;
	private int queueSize;

	private int front, numberOfItems, rear = 0;

	TheQueue(int size) {
		queueSize = size;
		queueArray = new String[size];
	}

	public void insert(String input) {
		if (queueSize == 0 && rear == 0) {
			queueArray[rear] = input;
			rear++;
		} else {
			queueArray[rear] = input;
			rear++;
		}

	}

	public void remove() {

		if (front <= rear) {
			queueArray[front] = "-1";
			front++;
			remove();
		}
	}

	public void display() {
		for (int i = 0; i < rear; i++) {
			System.out.println("Value in the queue " + queueArray[i]);
		}
	}

	public void peek() {

		System.out.println("The First Element is " + queueArray[front]);

	}

}