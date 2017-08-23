package com.example.JavaAlg;

import java.io.*;


public class BinarySearchTree {
	private NodeNew root, previous, current;

	class NodeNew {
		public int data;
		public NodeNew left, right;

		public NodeNew(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

	}

	public void display(NodeNew root) {
		if (root != null) {
			display(root.left);
			System.out.println(" " + root.data);
			display(root.right);
		}
	}

	private void find(int i) {
		find(root, i);
	}

	private void find(NodeNew root, int i) {
		if (root != null) {
			if (root.data < i) {
				find(root.right, i);
			} else if (root.data > i) {
				find(root.left, i);
			} else if (root.data == i) {
				System.out.println("Found Element " + i);
				return;
			}
		} else {
			System.out.println(" Element not found  " + i);
		}

	}

	private void insertToBST(int i) {
		NodeNew newNode = new NodeNew(i);
		NodeNew parent = root;

		while (true) {
			if (root == null) {
				root = newNode;
				return;
			} else {
				if (parent.data > i) {
					if (parent.left == null) {
						parent.left = newNode;
						return;
					} else {
						parent = parent.left;
					}
				} else {
					if (parent.right == null) {
						parent.right = newNode;
						return;
					} else {
						parent = parent.right;
					}
				}

			}

		}
	}

	private void insertRecursive(int i) {
		NodeNew nodeNew = new NodeNew(i);
		root = insert(root, nodeNew);
	}

	private NodeNew insert(NodeNew root, NodeNew nodeData) {
		if (root == null) {
			root = nodeData;
		} else {
			if (root != null) {
				if (root.data > nodeData.data) {
					root.left = insert(root.left, nodeData);
				} else {
					root.right = insert(root.right, nodeData);
				}
			}
		}
		return root;
	}


	private boolean isCompleteBtree() {
		return checkComplete(root);
	}

	private boolean checkComplete(NodeNew root) {
		while (root != null) {
			if (root.right == null && root.left == null) {
				return true;
			} else if (root.left == null) {
				return false;

			} else if (root.right == null) {
				return checkComplete(root.left);
			} else {
				NodeNew temp = root;
				root = root.left;
				if (checkComplete(root)) {
					root = temp.right;
					checkComplete(root);
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		// Let us create following BST
		//     50
		//    /  \
		//  30    70
		// / \   / \
		//20 40 60 80

		BinarySearchTree b = new BinarySearchTree();

		b.insertToBST(50);
		b.insertToBST(30);
		b.insertToBST(20);
		b.insertToBST(40);
		b.insertToBST(15);
		b.insertToBST(70);
		b.insertToBST(60);

		//b.display(b.root);
	//	b.find(45);
		if (b.isCompleteBtree()) {
			System.out.println("Yes its a perfect Btree");
		} else {
			System.out.println("Not Btree");

		}

	}

}

