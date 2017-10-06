package com.DataStruc.Stacks_Queues;
//Arrays, linked lists, trees, etc. are best for

//data that represents real objects.

//Stacks & Queues are instead used to complete a 
//task and are soon after discarded.

//Stacks & Queues
//1. Allow only a single item to be added or removed at a time
//2. Stacks allow access to the last item inserted (LIFO)
//3. Queues allow access to the first item inserted (FIFO)

public class TheStack {

	private String[] stackArray;
	private int stackSize;
	private int pointer = 0;

	TheStack(int size) {
		this.stackArray = new String[size];
		this.stackSize = size;
	}

	public void push(String value) {
		if (pointer != 0) {
			stackArray[pointer] = value;
			pointer++;

		} else {
			stackArray[pointer] = value;
			pointer++;
		}

	}

	public void display() {
		for (int i = 0; i < pointer; i++) {
			System.out.println("The value in the array after pop is " + stackArray[i]);
		}
	}

	public void pop() {
		while (pointer > 0 && stackSize > 0) {
			stackArray[pointer--] = "-1";
		}
		
	}

}