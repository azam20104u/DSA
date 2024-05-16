package com.azam.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBTree {

	public static void main(String[] args) {
		NodeTree root = new NodeTree(10);
		root.left = new NodeTree(20);
		root.left.left = new NodeTree(40);
		root.left.right = new NodeTree(50);
		root.right = new NodeTree(30);
		root.right.left = new NodeTree(60);
		root.right.right = new NodeTree(70);
		printLevelOrderBTree(root);
	}

	private static void printLevelOrderBTree(NodeTree root) {
		Queue<NodeTree> queue = new LinkedList<NodeTree>();
		queue.add(root);
		while (!queue.isEmpty()) {
			NodeTree temp = queue.poll();
			System.out.println(temp.data);
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

}
