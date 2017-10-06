package com.DataStruc.Stacks_Queues;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.setLeft(new Node(2));
		tree.root.setRight(new Node(3));
		tree.root.getLeft().setLeft(new Node(4));
		tree.root.getLeft().setRight(new Node(5));
		
		
		System.out.println("InOrder");
		tree.printInOrder();
		System.out.println("PreOrder");
		tree.printPreOrder();
		System.out.println("PostOrder");
		tree.printPostOrder();

	}

}
