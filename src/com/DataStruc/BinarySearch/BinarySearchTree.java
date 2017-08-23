package com.DataStruc.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	public static TreeNode root;
	List<String> treeDisplay = new ArrayList<String>();

	public BinarySearchTree() {
		this.root = null;
	}

	public void insert(int id) {
		TreeNode newNode = new TreeNode(id);
		if (root == null) {
			root = newNode;
			return;
		}
		TreeNode current = root;
		TreeNode parent = null;
		while (true) {
			parent = current;
			if (id < current.val) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public List<String> display(TreeNode root) {
		TreeNode parent = root;
		if (root != null) {
			treeDisplay.add(Integer.toString(root.val));
			display(root.left);
			display(parent.right);
		}
		return treeDisplay;
	}
		
}
