package com.example.JavaAlg;

public class NodeHeightTest {
	public static void main(String args[]) {
		BinaryTree trees = new BinaryTree();

		// Let us create a binary tree shown in above diagram
		trees.head = new NodeHeight(1);
		trees.head.left = new NodeHeight(2);
		trees.head.right = new NodeHeight(3);
		trees.head.left.left = new NodeHeight(4);
		trees.head.left.right = new NodeHeight(5);
		System.out.println("Height of tree is " + trees.getDept(trees.head));

		BinaryTreeImpl tree = new BinaryTreeImpl();
		tree.push(36); /* Last node of Linked List */
		tree.push(30);
		tree.push(25);
		tree.push(15);
		tree.push(12);
		tree.push(10); /* First node of Linked List */

		System.out.println("Inorder Traversal of the" + " constructed Binary Tree is:");
		tree.inorderTraversal(tree.convertList2Binary(tree.root));
	}

}
