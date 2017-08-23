package com.example.JavaAlg;

import java.util.LinkedList;
import java.util.Queue;

import java.util.LinkedList;
import java.util.Queue;

// A binary tree node
public class NodeHeight {
	int data;
	NodeHeight left, right;

	NodeHeight(int item) {
		data = item;
		left = right;
	}
}

class BinaryTree {
	NodeHeight head;
	int height = 0;
	int nodeDept = 0;
	NodeHeight left, right;

	public int getDept(NodeHeight node) {
		Queue<NodeHeight> queue = new LinkedList<NodeHeight>();
		queue.add(node);
		int heights = 0;

		while (true) {
			nodeDept = queue.size();
			if (nodeDept == 0) {
				return heights;
			}
			heights++;
			while (nodeDept > 0) {
				head = queue.poll();
				if (head.left != null) {
					queue.add(head.left);
				}
				if (head.right != null) {
					queue.add(head.right);
				}
				nodeDept--;

			}

		}
	}

}
