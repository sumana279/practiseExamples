package com.example.JavaAlg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NodeBST {
	int data;
	static int i;
	static int[] array;
	NodeBST root;
	NodeBST left;
	NodeBST right;

	public NodeBST() {
	}

	public NodeBST(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void insert(int data) {
		root = insert(root, data);
	}

	public NodeBST insert(NodeBST root, int data) {
		if (root == null) {
			root = new NodeBST(data);
		} else {

			if (root.data < data) {

				root.right = insert(root.right, data);

			} else {

				root.left = insert(root.left, data);

			}
		}
		return root;
	}

	public void displayInorderWithoutRecurssion(NodeBST root) {

		if (root == null) {
			System.out.println("Empty tree");
		} else {
			Stack<NodeBST> stack = new Stack<NodeBST>();
			stack.push(root);
			while (!stack.isEmpty()) {
				NodeBST temp = root;
				if (temp.left != null) {
					stack.push(temp.left);
					temp = temp.left;
				} else {
					while (!stack.isEmpty()) {
						System.out.println(stack.pop());
					}

				}

			}
		}

	}

	public void displayInOrderTree(String methodNeeded) {

		if (methodNeeded.equalsIgnoreCase("INORDER")) {
			array = new int[8];
			displayInOrderTree(root);
		} else if (methodNeeded.equalsIgnoreCase("PREORDER")) {
			displayPreOrderTree(root);
		} else if (methodNeeded.equalsIgnoreCase("POSTORDER")) {
			displayPostOrderTree(root);
		}
	}

	private void displayInOrderTree(NodeBST root) {
		if (root != null) {
			displayInOrderTree(root.left);
			array[i] = root.data;
			i++;
			System.out.println(root.data);
			displayInOrderTree(root.right);

		}
	}

	private void displayPreOrderTree(NodeBST root) {
		if (root != null) {
			System.out.println(root.data);
			displayPreOrderTree(root.left);
			displayPreOrderTree(root.right);
		}
	}

	private void displayPostOrderTree(NodeBST root) {
		if (root != null) {
			displayPostOrderTree(root.left);
			displayPostOrderTree(root.right);
			System.out.println(root.data);
		}
	}

	private void deleteNode(NodeBST node2Delete) {
		deleteNode(node2Delete, root);
	}

	private NodeBST deleteNode(NodeBST node2Delete, NodeBST root) {
		if (node2Delete != null) {
			if (root != null) {
				if (root.data == node2Delete.data) {
					if ((root.left == null && root.right == null)) {
						System.out.println("Delete Node " + root.data);
						root = null;
					} else if (root.left == null) {
						root = root.right;
					} else if (root.left != null && root.right != null) {
						NodeBST minVal = minChildNode(root.right);
						deleteNode(minVal, root);
						root.data = minVal.data;
					}

				} else {
					if (root.data > node2Delete.data) {
						NodeBST left = root.left;
						root.left = deleteNode(node2Delete, left);
					} else {
						NodeBST right = root.right;
						root.right = deleteNode(node2Delete, right);
					}
				}
			} else {
				return root;
			}
		}
		return root;
	}

	private NodeBST minChildNode(NodeBST root) {
		int min = root.data;
		if (root != null) {
			while (root.left != null) {
				if (root.left.data < min) {
					min = root.left.data;
				} else {
					root = root.left;
				}
			}

		}
		return root;
	}

	private void breathFirstSearch(NodeBST root) {
		if (root == null) {
			System.out.println("Empty Tree");
			return;
		} else {

			Queue<NodeBST> queue = new LinkedList<>();
			queue.add(root);
			int nodeSize = queue.size();
			System.out.println(root.data);
			while (nodeSize > 0) {
				NodeBST nodeTemp = queue.poll();
				nodeSize--;

				if (nodeTemp.left != null) {
					System.out.println(nodeTemp.left.data);
					queue.add(nodeTemp.left);
				}
				if (nodeTemp.right != null) {
					System.out.println(nodeTemp.right.data);
					queue.add(nodeTemp.right);
				}
				nodeSize = queue.size();
			}

		}
	}

	private int sizeOfATree(NodeBST root) {
		NodeBST temp = root;
		if (temp == null) {
			return 0;
		} else {
			int left = sizeOfATree(temp.left);
			int right = sizeOfATree(temp.right);

			return left + right + 1;
		}
	}

	private Boolean isIdenticals(NodeBST tree1, NodeBST tree2) {
		return isIdentical(tree1.root, tree2.root);
	}

	private Boolean isIdentical(NodeBST tree1, NodeBST tree2) {
		while (tree1 != null && tree2 != null) {
			if (tree1.data != tree2.data) {
				return false;
			} else {
				return isIdentical(tree1.left, tree2.left) && isIdentical(tree1.right, tree2.right);

			}
		}
		return true;

	}

	private int sizeOfATree() {
		return sizeOfATree(root);
	}

	private void displayInorderWithoutRecurssion() {
		displayInorderWithoutRecurssion(root);
	}

	private void breathFirstSearch() {
		breathFirstSearch(root);
	}

	private void checkSumProp() {
		checkSumProp(root);
	}

	private boolean checkSumProp(NodeBST root) {
		if (root == null) {
			return true;
		} else {
			if (rootSum(root)) {
				root = root.left;
				checkSumProp(root);
				root = root.right;
				checkSumProp(root);
			}
		}
		return false;
	}

	private boolean rootSum(NodeBST root2) {
		if (root.data == (root.left.data + root.right.data)) {
			return true;
		}
		return false;
	}

	private void findPredecessorSuccessor(NodeBST nodeBST) {
		int succ = 0;
		int prec = 0;
		NodeBST newTempNode = root;
		if (nodeBST != null) {
			while (newTempNode != null)
				if (newTempNode.data < nodeBST.data) {
					if (newTempNode.right != null) {
						succ = newTempNode.right.data;
						prec = newTempNode.data;
						newTempNode = newTempNode.right;
					} else if (newTempNode.left == null && newTempNode.right == null) {
						break;
					} else {
						succ = 0;
						prec = newTempNode.data;
						break;
					}
				} else if (newTempNode.data > nodeBST.data) {
					if (newTempNode.left != null) {
						prec = newTempNode.left.data == nodeBST.data ? 0 : newTempNode.left.data;
						succ = newTempNode.data;
						newTempNode = newTempNode.left;
					} else if (newTempNode.left == null && newTempNode.right == null) {
						break;
					} else {
						prec = 0;
						succ = newTempNode.data;
						break;
					}
				} else if (newTempNode.data == nodeBST.data) {
					if (newTempNode.right != null && newTempNode.left != null) {
						succ = newTempNode.right.data;
						prec = newTempNode.left.data;
						break;
					} else {

						break;
					}
				}
		}
		System.out.println(
				"The values of Predecessor are " + prec + " and Successor " + succ + " for given node " + nodeBST.data);
	}

	private NodeBST LCA(int n1, int n2) {
		return lcaPriv(root, n1, n2);
	}

	private NodeBST lcaPriv(NodeBST root, int n1, int n2) {
		if (root == null) {
			return null;
		}

		if (root.data > n1 && root.data > n2) {
			return lcaPriv(root.left, n1, n2);
		}
		if (root.data < n1 && root.data < n2) {
			return lcaPriv(root.right, n1, n2);
		}

		return root;
	}

	private void inRange(int n1, int n2) {
		NodeBST rootTemp = root;
		inRange(rootTemp, n1, n2);
	}

	private void inRange(NodeBST rootTemp, int n1, int n2) {
		if (rootTemp != null) {
			inRange(rootTemp.left, n1, n2);
			printInRange(rootTemp, n1, n2);
			inRange(rootTemp.right, n1, n2);
		}

	}

	private void printInRange(NodeBST rootTemp, int n1, int n2) {

		if (n1 <= rootTemp.data && n2 >= rootTemp.data) {
			System.out.println(" The Values are " + rootTemp.data);
		}

	}

	private void sortedArray2BST(int[] array) {
		int start = 0;
		int mid = array.length / 2;
		int end = array.length;
		root = insert(root, array[mid]);
		sortedArray2BST(array, start, mid);
		sortedArray2BST(array, mid + 1, end);
	}

	private void sortedArray2BST(int[] array, int start, int end) {
		while (start < end) {
			root = insert(root, array[start]);
			start++;

		}
	}

	private NodeBST constructBst4mPreOrder(int[] array) {
		Stack<NodeBST> stack = new Stack<NodeBST>();
		while (!stack.isEmpty()) {
			stack.pop();
		}
		root = new NodeBST(array[0]);
		stack.push(root);
		for (int i = 1; i < array.length; i++) {
			NodeBST temp = null;
			while (!stack.isEmpty() && array[i] > stack.peek().data) {
				temp = stack.pop();
			}
			if (temp != null) {
				temp.right = new NodeBST(array[i]);
				// root.right = temp.right;
				stack.push(temp.right);
			} else {
				temp = stack.peek();
				temp.left = new NodeBST(array[i]);
				stack.push(temp.left);
			}

		}

		return root;
	}

	private void addGreaterUntil() {
		int sum = 0;
		sum = addGreaterUnit(root, sum);

	}

	private int addGreaterUnit(NodeBST node, int sum) {
		if (node == null) {
			return 0;
		}
		if (node.right != null) {
			sum = addGreaterUnit(node.right, sum);
		}
		sum = sum + node.data;
		node.data = sum;

		if (node.left != null) {
			sum = addGreaterUnit(node.left, sum);
		}
		return sum;

	}

	public static void main(String[] args) {
		NodeBST tree = new NodeBST();

		int[] arrays = { 12, 3, 4, 1, 6, 9 };
		int[] array2 = { 10, 5, 1, 7, 40, 50 };
		tree.root = new NodeBST(11);
		tree.root.left = new NodeBST(2);
		tree.root.left.left = new NodeBST(1);
		tree.root.left.right = new NodeBST(7);
		tree.root.right = new NodeBST(29);
		tree.root.right.left = new NodeBST(15);
		tree.root.right.right = new NodeBST(40);
		tree.root.right.right.left = new NodeBST(35);

		tree.addGreaterUntil();
		System.out.println("addGreaterUntil Inorder BEgin");

		tree.displayInOrderTree("INORDER");
		// tree.constructBst4mPreOrder(array2);
		// tree.sortedArray2BST(arrays);
		System.out.println("Inorder BEgin");
		// tree.displayInOrderTree("INORDER");

		int sum = 24;
		// for (int i = 0; i < array.length; i++) {
		// int left = i + 1;
		// int right = array.length - 1;
		// while (left < right) {
		// // if (array[i] + (array[left + 1] == array[i] ? 0 : array[left+
		// // 1]) + array[right] == sum) {
		// if (array[i] + array[left] + array[right] == sum) {
		//
		// System.out.println(" Elements found " + array[i] + " " + array[left]
		// + " " + array[right]);
		// break;
		// } else if (array[i] + array[left] + array[right] > sum) {
		// right--;
		// } else {
		// left++;
		// }
		//
		// }
		// }
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("INORDER BEgin");
		// tree.displayInOrderTree("INORDER");
		System.out.println("PREORDER BEgin");
		tree.displayInOrderTree("PREORDER");
		System.out.println("POSTORDER BEgin");
		tree.displayInOrderTree("POSTORDER");
		// 50
		// / \
		// 30 70
		// / \ / \
		// 20 40 60 80
		// /
		// 10
		// /
		// 5

		// tree.inRange(20, 80);

		System.out.println("BreadthFirstSearch");

		tree.breathFirstSearch();
		// tree.displayInorderWithoutRecurssion();
		System.out.println(" Size of a tree is " + tree.sizeOfATree());
		tree.findPredecessorSuccessor(new NodeBST(20));
		tree.findPredecessorSuccessor(new NodeBST(65));
		tree.findPredecessorSuccessor(new NodeBST(80));
		tree.findPredecessorSuccessor(new NodeBST(75));
		tree.findPredecessorSuccessor(new NodeBST(25));
		tree.findPredecessorSuccessor(new NodeBST(70));
		tree.findPredecessorSuccessor(new NodeBST(95));
		tree.findPredecessorSuccessor(new NodeBST(15));
		System.out.println(tree.LCA(5, 30).data + " IS the LCA");

		// System.out.println(tree.isIdenticals(tree, tree2));
		tree.deleteNode(new NodeBST(20));
		System.out.println("BreadthFirstSearch20");
		tree.breathFirstSearch();
		// tree.checkSumProp();

		tree.deleteNode(new NodeBST(30));
		System.out.println("BreadthFirstSearch30");
		tree.breathFirstSearch();

		tree.deleteNode(new NodeBST(50));
		System.out.println("BreadthFirstSearch50");
		tree.breathFirstSearch();
	}

}
