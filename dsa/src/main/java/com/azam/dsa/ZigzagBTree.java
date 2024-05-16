package com.azam.dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigzagBTree {

	public static void main(String[] args) {
		NodeTree root = new NodeTree(10);
		root.left = new NodeTree(20);
		root.left.left = new NodeTree(40);
		root.left.right = new NodeTree(50);
		root.right = new NodeTree(30);
		root.right.left = new NodeTree(60);
		root.right.right = new NodeTree(70);
		printZigzagBTree(root);
	}

	private static void printZigzagBTree(NodeTree root) {
		Queue<NodeTree> queue = new LinkedList<NodeTree>();
		queue.add(root);
		boolean leftToRight = true;
		while (!queue.isEmpty()) {
			Stack<NodeTree> reverse = new Stack<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				NodeTree temp = queue.poll();
				if (leftToRight) {
					System.out.print(temp.data+" ");
				} else {
					reverse.add(temp);
				}
				if (temp.left != null) queue.add(temp.left);
				if (temp.right != null) queue.add(temp.right);
			}
			while (!reverse.isEmpty()) {
                NodeTree temp = reverse.pop();
                System.out.print(temp.data+" ");
            }
			leftToRight=!leftToRight;
		}
	}
}
