package com.DataStruc.Stacks_Queues;

public class BinaryTree {
	Node root;

	BinaryTree() {
		this.root = null;
	}

	void printInOrder(Node node) {
		if (node == null) {
			return;
		}

		printInOrder(node.getLeft());

		System.out.println("The data value is " + node.getKey());

		printInOrder(node.getRight());
	}

	void printPreOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.println("The data value is " + node.getKey());

		printPreOrder(node.getLeft());

		printPreOrder(node.getRight());
	}

	void printPostOrder(Node node) {
		if (node == null) {
			return;
		}

		printPostOrder(node.getLeft());

		printPostOrder(node.getRight());

		System.out.println("The data value is " + node.getKey());

	}

	public void printPostOrder() {
		printPostOrder(root);
	}

	public void printPreOrder() {
		printPreOrder(root);
	}

	public void printInOrder() {
		printInOrder(root);
	}
}
