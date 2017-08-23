package com.example.JavaAlg;

public class StackUsingLinkedList {
	Node head = null;
	int size = 0;

	public void push(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
		} else {
			// Node temp = head;
			newNode.next = head;
			head = newNode;

		}
		size++;
	}

	public int pop() {
		if (size == 0) {
			System.out.println("Stack is Empty");
			return -1;

		} else {
			Node temp = head;
			head = head.next;
			size--;
			return temp.data;
		}

	}

	public void printStack() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackUsingLinkedList stck = new StackUsingLinkedList();
		stck.push(1);
		stck.push(2);
		stck.push(4);
		stck.printStack();
		System.out.println("Pop out element " + stck.pop());
		stck.printStack();
	}

	class Node{
	    int data;
	    Node next;
	    public Node(int data){
	        this.data = data;
	    }
}
}