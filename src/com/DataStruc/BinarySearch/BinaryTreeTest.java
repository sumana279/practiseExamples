package com.DataStruc.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		List<String> treeDisplay = new ArrayList<String>();

		bst.insert(1);
		bst.insert(2);
		bst.insert(5);
		bst.insert(3);

		treeDisplay = bst.display(bst.root);
		System.out.println(treeDisplay.toString());
	}

}
