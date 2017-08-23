package com.example.JavaAlg;

import java.util.LinkedList;
import java.util.Queue;

class ListNode {
	int data;
	ListNode next;

	ListNode(int d) {
		data = d;
		next = null;
	}
}

class BinarySearchNode {
	int data;
	BinarySearchNode left, right = null;

	BinarySearchNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}



}

class BinaryTreeImpl {
	ListNode head;
	BinarySearchNode root;

	void push(int data) {
		ListNode newHead = new ListNode(data);
		if (head == null) {
			head = newHead;
		} else {
			newHead.next = head;
			head = newHead;
		}
	//	root = new BinarySearchNode(head);

	}

	BinarySearchNode convertList2Binary(BinarySearchNode node) {
		Queue<BinarySearchNode> q = new LinkedList<BinarySearchNode>();
		if (head == null) {
			node = null;
			return null;
		} else {
			q.add(node);

			head = head.next;
			while (head != null) {
				BinarySearchNode parent = q.peek();
				BinarySearchNode left = null, right = null;

				left = new BinarySearchNode(head.data);
				q.add(left);
				head = head.next;
				if (head != null) {
					right = new BinarySearchNode(head.data);
					head = head.next;
				}

				parent.left = left;
				parent.right = right;

			}

		}

		return node;

	}

	void inorderTraversal(BinarySearchNode node) {
		if (node != null) {
			inorderTraversal(node.left);
			System.out.print(node.data + " ");
			inorderTraversal(node.right);
		}
	}

}
