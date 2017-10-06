package com.DataStruc.Stacks_Queues;

public class StackQueueTest {

	public static void main(String[] args) {
		TheStack stack = new TheStack(10);
		stack.push("s");
		stack.push("u");

		stack.push("d");

		stack.push("h");

		stack.push("a");

		stack.push("n");
		// stack.display();
		stack.pop();
		stack.display();

		TheQueue theQueue = new TheQueue(10);
		theQueue.insert("s");
		theQueue.insert("u");
		theQueue.insert("v");
		theQueue.insert("r");
		theQueue.insert("a");
		theQueue.insert("t");
		theQueue.insert("h");
		theQueue.insert("a");
		theQueue.display();
		theQueue.remove();
		theQueue.display();

	}

}
