package com.example.JavaAlg;

public class Deque {
	private int[] array;
	private int size;
	private int front;
	private int rear;

	public Deque(int[] array) {
		this.front = -1;
		this.size = array.length - 1;
		this.rear = size;
		this.array = array;
	}

	public void addElementtoFront(int newElement) {
		if (front == -1) {
			rear = 0;
			array[++front] = newElement;
		} else if (front == size) {
			front = 0;
		} else {
			front++;

		}
		array[front] = newElement;

	}

	public boolean isFull() {
		return front == 0 && rear == size;
	}

	public void addElementtoRear(int newElement) {
		if (rear == 0) {
			rear = size;
		} else if (front == -1) {
			front = size;
		} else {
			rear--;
		}
		array[rear] = newElement;

	}

	public int getFrontElement() {
		if (front != -1) {
			return array[front];
		} else {
			System.out.println("Empty Arrray");
		}
		return -1;

	}

	public int getRearElement() {

		return array[rear];

	}

	public void deleteFromRear() {
		if (rear == 0) {
			rear = size;
		} else if (front == -1) {
			front = size;
		}
		array[rear] = 0;
        rear--;
	}

	public static void main(String[] args) {
		int nums[] = new int[10];
		Deque dq = new Deque(nums);

		// dq.addElementtoFront(10);
		dq.addElementtoRear(90);
		System.out.println(dq.getRearElement());
		System.out.println(dq.getFrontElement());
		dq.addElementtoFront(20);
		dq.addElementtoFront(40);
		dq.addElementtoRear(90);
		dq.addElementtoRear(80);

		System.out.println(dq.getFrontElement());

		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + "th postion" + nums[i]);
		}
		dq.deleteFromRear();

		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + "th postion after delete" + nums[i]);
		}
	}
}
